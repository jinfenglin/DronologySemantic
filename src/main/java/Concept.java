public class Concept {
    public java.lang.String word;
    public java.lang.String category;
    public int weight;
    public java.lang.String acronym;
    public java.lang.String type;

    public Concept(java.lang.String word, java.lang.String category, java.lang.String acronym, java.lang.String type, int weight) {
        this.word = word;
        this.category = category;
        this.acronym = acronym;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Concept{" +
                "word='" + word + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", acronym='" + acronym + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
