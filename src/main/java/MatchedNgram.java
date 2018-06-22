/**
 *
 */
public class MatchedNgram implements Comparable<MatchedNgram> {
    public Concept concept;
    public String ngram;

    public MatchedNgram(Concept concept, String ngram) {
        this.concept = concept;
        this.ngram = ngram;
    }

    int getN() {
        return AssignConcepts.countTokenNum(ngram);
    }

    @Override
    public int compareTo(MatchedNgram o) {
        return Integer.compare(this.getN(), o.getN());
    }
}
