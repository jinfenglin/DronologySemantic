/**
 *
 */
public class Relation {
    String cp1, cp2, type;

    public Relation(String cp1, String cp2, String type) {
        this.cp1 = cp1;
        this.cp2 = cp2;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Relation relation = (Relation) o;

        if (cp1 != null ? !cp1.equals(relation.cp1) : relation.cp1 != null) return false;
        if (cp2 != null ? !cp2.equals(relation.cp2) : relation.cp2 != null) return false;
        return type != null ? type.equals(relation.type) : relation.type == null;
    }

    @Override
    public int hashCode() {
        int result = cp1 != null ? cp1.hashCode() : 0;
        result = 31 * result + (cp2 != null ? cp2.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
