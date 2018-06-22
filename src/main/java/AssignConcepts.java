import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;

import java.util.*;
import java.util.stream.Collectors;

public class AssignConcepts {
    List<File> targetFiles;
    File conceptFile;
    File resFile;
    Map<String, Concept> conceptMap;
    Map<String, Concept> acronymMap;
    Set<String> stopwords = StopWords.stopwords;

    public AssignConcepts(List<File> targetFiles, File conceptFile) {
        this.targetFiles = targetFiles;
        this.conceptFile = conceptFile;
        conceptMap = new HashMap<>();
        acronymMap = new HashMap<>();
        resFile = new File("data/res.txt");
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

    private List<String> parseJavaFile(File javaFile) throws IOException {
        List<MatchedNgram> relatedConcepts = new ArrayList<>();
        String content = new String(Files.readAllBytes(javaFile.toPath()));
        content = content.replaceAll("import [^;]+", " ");
        content = content.replaceAll("package [^;]+;", " ");
        String[] tokens = content.split("\\W+");
        List<String> cleanTokens = new ArrayList<>();
        String tokenizedContent = "";
        for (String token : tokens) {
            String[] subTokens = token.split("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])");
            cleanTokens.addAll(Arrays.asList(subTokens));
        }
        tokenizedContent = String.join(" ", cleanTokens).toLowerCase();
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
            int a = 0;
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

    private List<String> getNgarms(String text, int n) {
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
            int pos = 0;
            for (String gram : grams) {
                if (pos == 0 || pos == grams.size() - 1) {
                    List<String> blackList = Arrays.asList(new String[]{"by", "to", "as", "and", "or"});
                    boolean flag = true;
                    for (String blackListTerm : blackList) {
                        if (blackListTerm.equals(gram)) {
                            validNGram = false;
                            flag = false;
                            break;
                        }
                    }
                    if (flag == false)
                        break;
                }
                if (!stopwords.contains(gram) && gram.length() > 1) {
                    validNGram = true;
                    break;
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
            List<String> iGrams = getNgarms(concept, i + 1);
            for (String iGram : iGrams) {
                if (containsTokenSeq(content, iGram))
                    return iGram;
            }
        }
        return "";
    }

    public void run() throws IOException {
        parseConceptFile();
        Writer writer = new FileWriter(resFile);
        Gson gson = new GsonBuilder().create();
        List<ArtfifactConcept> res = new ArrayList<>();
        for (File file : targetFiles) {
            System.out.println(file.getName());
            ArtfifactConcept artfifactConcept = new ArtfifactConcept();
            List<String> concepts = parseJavaFile(file);
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
