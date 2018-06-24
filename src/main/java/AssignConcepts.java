import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;

import java.util.*;
import java.util.stream.Collectors;

public class AssignConcepts {
    Map<File, String> cleanTargetFiles;
    File conceptFile;
    File linkConceptOutput;
    File queryTermOutput;
    Map<String, Concept> conceptMap;
    Map<String, Concept> acronymMap;
    Set<String> stopwords;

    public AssignConcepts(List<File> targetFiles, File conceptFile) throws IOException {
        cleanTargetFiles = new HashMap<>();
        stopwords = new HashSet<>();
        stopwords.addAll(StopWords.javaKeyWords);
        stopwords.addAll(StopWords.regularStopwords);
        preprocess(targetFiles);
        this.conceptFile = conceptFile;
        conceptMap = new HashMap<>();
        acronymMap = new HashMap<>();
        linkConceptOutput = new File("data/linkedConcept.txt");
        queryTermOutput = new File("data/queryTerm.txt");
    }

    private void parseConceptFile() throws IOException {
        List<String> lines = Files.readAllLines(conceptFile.toPath());
        int cnt = 0;
        for (String line : lines) {
            cnt += 1;
            if (cnt == 1)
                continue;
            String[] parts = line.split("\t");
            String category = parts[0];
            String type = parts[3];
            String word = parts[4];
            String fullAcronym = parts[5].split(":")[0];
            int weight = Integer.valueOf(parts[2]);
            Concept concept;
            if (type.equals("CONCEPT")) {
                if (conceptMap.containsKey(word)) {
                    concept = conceptMap.get(word);
                    concept.weight += weight;
                } else {
                    concept = new Concept(word, category, fullAcronym, type, weight);
                }
                conceptMap.put(word, concept);
            } else {
                if (acronymMap.containsKey(word)) {
                    concept = acronymMap.get(word);
                    concept.weight += weight;
                } else {
                    concept = new Concept(word, category, fullAcronym, type, weight);
                }
                acronymMap.put(word, concept);
            }


        }
    }

    private List<List<String>> tokenzie(File javaFile) throws IOException {
        String content = new String(Files.readAllBytes(javaFile.toPath()));
        String[] lines = content.split("\n");
        List<List<String>> cleanTokens = new ArrayList<>();
        for (String line : lines) {
            line = line.replaceAll("import [^;]+", " ");
            line = line.replaceAll("package [^;]+;", " ");
            line = line.replaceAll("@author.+", " ");
            line = line.replaceAll("@\\S+", " ");
            String[] tokens = line.split("[^a-zA-Z]+");
            List<String> tmp = new ArrayList<>();
            for (String token : tokens) {
                String[] subTokens = token.split("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])");
                tmp.addAll(Arrays.asList(subTokens));
            }
            cleanTokens.add(tmp);
        }
        return cleanTokens;
    }

    private List<String> clean(List<List<String>> lineOfToken) {
        List<String> res = new ArrayList<>();
        for (List<String> line : lineOfToken) {
            List<String> cleanLine = new ArrayList<>();
            for (String token : line) {
                if (stopwords.contains(token.toLowerCase()) || token.length() <= 1) {
                    continue;
                }
                cleanLine.add(token);
            }
            if (cleanLine.size() > 0)
                res.add(String.join(" ", cleanLine));
        }
        return res;
    }

    private void preprocess(List<File> targetFiles) throws IOException {
        File processedFileDir = new File("data/cleanJava");
        if (!processedFileDir.exists()) {
            processedFileDir.mkdir();
        }
        for (File file : targetFiles) {
            List<List<String>> tokenizedLines = tokenzie(file);
            List<String> cleandContent = clean(tokenizedLines);
            String content = String.join(" ", cleandContent);
            content = content.toLowerCase();
            String lines = String.join("\n", cleandContent);

            cleanTargetFiles.put(file, content);
            File cleanFile = new File(processedFileDir, file.getName());
            Files.write(cleanFile.toPath(), lines.getBytes());
        }
    }

    private List<String> matchConcept(File javaFile) throws IOException {
        List<MatchedNgram> relatedConcepts = new ArrayList<>();
        String tokenizedContent = cleanTargetFiles.get(javaFile);

        for (String concept : conceptMap.keySet()) {
            String longestGram = match(tokenizedContent, concept);
            int gramLength = countTokenNum(longestGram);
            if (gramLength > 1) {
                relatedConcepts.add(new MatchedNgram(conceptMap.get(concept), longestGram));
            }
        }
        Collections.sort(relatedConcepts, Collections.reverseOrder());
        List<String> res = new ArrayList<>();
        if (relatedConcepts.size() > 0) {
            int longestGramLength = relatedConcepts.get(0).getN();
            List<MatchedNgram> topConcepts = relatedConcepts.stream().filter(x -> x.getN() == longestGramLength).collect(Collectors.toList());
            Map<String, Integer> topGrams = new HashMap<>();
            for (MatchedNgram matchedNgram : topConcepts) {
                if (!topGrams.containsKey(matchedNgram.ngram)) {
                    topGrams.put(matchedNgram.ngram, 1);
                }
                topGrams.put(matchedNgram.ngram, topGrams.get(matchedNgram.ngram) + 1);
            }
            res.addAll(topGrams.keySet());
        }
        return res;
    }

    public static int countTokenNum(String str) {
        String[] tokens = str.split(" ");
        int i = 0;
        for (String token : tokens) {
            if (token.length() > 0)
                i++;
        }
        return i;
    }

    private List<String> getNgrams(String text, int n) {
        String[] tokens = text.split(" ");
        List<String> nGrams = new ArrayList<>();
        for (int i = 0; i < tokens.length - 1; i++) {
            List<String> grams = new ArrayList<>();
            if (i + n >= tokens.length)
                break;
            for (int j = 0; j < n; j++) {
                grams.add(tokens[i + j]);
            }
            boolean validNGram = false;
            for (String gram : grams) {
                if (!stopwords.contains(gram) && gram.length() > 1) {
                    validNGram = true;
                }
            }
            int pos = 0;
            for (String gram : grams) {
                if ((pos == 0 || pos == grams.size() - 1) && validNGram) {
                    List<String> blackList = Arrays.asList(new String[]{"by", "to", "as", "and", "or", "of", "for"});
                    for (String blackListTerm : blackList) {
                        if (blackListTerm.equals(gram)) {
                            validNGram = false;
                            break;
                        }
                    }
                }
                pos += 1;
            }

            if (validNGram)
                nGrams.add(String.join(" ", grams));
        }
        return nGrams;
    }

    private boolean containsTokenSeq(String content, String target) {
        List<String> contentTokens = Arrays.asList(content.split(" "));
        List<String> targetTokens = Arrays.asList(target.split(" "));
        int index = Collections.indexOfSubList(contentTokens, targetTokens);
        return index >= 0;
    }

    private String match(String content, String concept) {
        int tokenLen = concept.split(" ").length;
        for (int i = tokenLen - 1; i >= 0; i--) {
            List<String> iGrams = getNgrams(concept, i + 1);
            for (String iGram : iGrams) {
                if (containsTokenSeq(content, iGram))
                    return iGram;
            }
        }
        return "";
    }

    private <T> Map<T, List<String>> getNgrams(Map<T, String> dataset, int n) {
        Map<T, List<String>> res = new HashMap<>();
        for (T key : dataset.keySet()) {
            res.put(key, getNgrams(dataset.get(key), n));
        }
        return res;
    }

    private List<String> extractKeyNgrams(File file, Map<File, List<String>> ngramDocs, int n) {
        List<String> queryNGram = new ArrayList<>();
        List<String> curFileGrams = ngramDocs.get(file);
        TFIDFCalculator tfidfCalculator = new TFIDFCalculator(curFileGrams, new ArrayList<>(ngramDocs.values()));
        queryNGram = new ArrayList<>(tfidfCalculator.getTopN(5).keySet());
        return queryNGram;

    }

    public void run() throws IOException {
        parseConceptFile();
        Writer writer = new FileWriter(linkConceptOutput);
        Gson gson = new GsonBuilder().create();
        List<ArtfifactConcept> res = new ArrayList<>();
        Map<File, List<String>> nGramDocs = getNgrams(cleanTargetFiles, 3);
        for (File file : cleanTargetFiles.keySet()) {
            System.out.println(file.getName());
            ArtfifactConcept artfifactConcept = new ArtfifactConcept();
            List<String> concepts = matchConcept(file);
            List<String> queryTerms = extractKeyNgrams(file, nGramDocs, 3);
            artfifactConcept.setConcepts(concepts);
            artfifactConcept.setFileName(file.getName());
            res.add(artfifactConcept);
        }
        gson.toJson(res, writer);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        List<File> javaFiles = Arrays.asList(new File("data/javaCode").listFiles());
        File conceptFile = new File("data/semantics/database.txt");
        AssignConcepts ac = new AssignConcepts(javaFiles, conceptFile);
        ac.run();
    }
}
