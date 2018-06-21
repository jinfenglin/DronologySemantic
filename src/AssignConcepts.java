import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class AssignConcepts {
    List<File> targetFiles;
    File conceptFile;
    File resFile;
    Map<String, Concept> conceptMap;
    Map<String, Concept> acronymMap;

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

    private List<Concept> parseJavaFile(File javaFile) throws IOException {
        List<Concept> relatedConcepts = new ArrayList<>();
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
            if (match(tokenizedContent, concept)) {
                relatedConcepts.add(conceptMap.get(concept));
            }
        }

        return relatedConcepts;
    }

    private List<String> getBigarms(String text) {
        String[] tokens = text.split(" ");
        List<String> bigrams = new ArrayList<>();
        for (int i = 0; i < tokens.length - 1; i++) {
            bigrams.add(String.join(" ", tokens[i], tokens[i + 1]));
        }
        return bigrams;
    }

    private boolean match(String content, String concept) {
        List<String> bigrams = getBigarms(concept);
        for (String bigram : bigrams) {
            if (content.contains(bigram))
                return true;
        }
        return false;
    }

    public void run() throws IOException {
        parseConceptFile();
        PrintWriter pw = new PrintWriter(new FileWriter(resFile));
        for (File file : targetFiles) {
            System.out.println(file.getName());
            pw.write(file.getName() + ":\n");
            List<Concept> concepts = parseJavaFile(file);
            for (Concept concept : concepts) {
                pw.write(concept.word + "," + concept.weight + "|");
            }
            pw.write("\n");
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        List<File> javaFiles = Arrays.asList(new File("data/javaCode").listFiles());
        File conceptFile = new File("data/semantics/database.txt");
        AssignConcepts ac = new AssignConcepts(javaFiles, conceptFile);
        ac.run();
    }
}
