public class Concept {
    public String word;
    public String category;
    public int weight;
    public String acronym;
    public String type;

    public Concept(String word, String category, String acronym, String type, int weight) {
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
