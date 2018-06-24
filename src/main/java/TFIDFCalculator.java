import java.util.*;

import java.util.List;

/**
 * @author Mohamed Guendouz
 */
public class TFIDFCalculator {
    Map<String, Double> tfScore;
    Map<String, Double> TFIDFScore;
    List<String> targetDoc;
    List<List<String>> docs;

    public TFIDFCalculator(List<String> doc, List<List<String>> docs) {
        tfScore = new HashMap<>();
        TFIDFScore = new HashMap<>();
        this.targetDoc = doc;
        this.docs = docs;
        tf();
        idf();
    }

    public Map<String, Double> getTopN(int n) {
        Map<String, Double> res = new HashMap<>();
        for (int i = 0; i < n; i++) {
            double hScore = -1;
            String hTerm = null;
            for (String term : TFIDFScore.keySet()) {
                double curScore = TFIDFScore.get(term);
                if (curScore > hScore && !res.containsKey(term)) {
                    hScore = curScore;
                    hTerm = term;
                }
            }
            res.put(hTerm, hScore);
        }
        return res;
    }

    private void tf() {
        for (String term : targetDoc) {
            if (!tfScore.containsKey(term)) {
                tfScore.put(term, 0.0);
            }
            tfScore.put(term, tfScore.get(term) + 1);
        }

        for (String term : tfScore.keySet()) {
            tfScore.put(term, tfScore.get(term) / targetDoc.size());
        }
    }

    public void idf() {
        for (String term : tfScore.keySet()) {
            double n = 0;
            for (List<String> doc : docs) {
                for (String word : doc) {
                    if (term.equalsIgnoreCase(word)) {
                        n++;
                        break;
                    }
                }
            }
            double termIDFScore = Math.log(docs.size() / n);
            TFIDFScore.put(term, tfScore.get(term) * termIDFScore);
        }
    }

    public double tfIdf(String term) {
        return TFIDFScore.get(term);
    }


    public static void main(String[] args) {

        List<String> doc1 = Arrays.asList("Lorem", "ipsum", "dolor", "ipsum", "sit", "ipsum");
        List<String> doc2 = Arrays.asList("Vituperata", "incorrupte", "at", "ipsum", "pro", "quo");
        List<String> doc3 = Arrays.asList("Has", "persius", "disputationi", "id", "simul");
        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3);

        TFIDFCalculator calculator = new TFIDFCalculator(doc1, documents);
        double tfidf = calculator.tfIdf("ipsum");
        System.out.println("TF-IDF (ipsum) = " + tfidf);
    }

}
