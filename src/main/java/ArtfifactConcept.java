import java.util.List;

public class ArtfifactConcept {
    private String fileName;
    private List<String> concepts;

    public List<String> getConcepts() {
        return concepts;
    }

    public void setConcepts(List<String> concepts) {
        this.concepts = concepts;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
