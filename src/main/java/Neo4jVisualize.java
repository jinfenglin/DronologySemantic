

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class Neo4jVisualize {
    private static Connection con;

    private static void executeQuery(String query) throws SQLException {
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.executeQuery();
        }
    }

    public static void clear() throws SQLException {
        String query = "MATCH (n)\n" +
                "OPTIONAL MATCH (n)-[r]-()\n" +
                "DELETE n,r";
        executeQuery(query);
    }

    public static void addNode(String concept) throws SQLException {
        concept = concept.replaceAll("\'", " ");
        String query = String.format("CREATE (n:Concept { value : '%s' })", concept);
        executeQuery(query);

    }

    public static void addRelation(String cp1, String cp2, String relationType) throws SQLException {
        cp1 = cp1.replaceAll("\'", " ");
        cp2 = cp2.replaceAll("\'", " ");
        String query = String.format("MATCH (cp1:Concept {value:'%s'}), (cp2:Concept {value:'%s'}) CREATE (cp1)-[:%s]->(cp2)", cp1, cp2, relationType);
        executeQuery(query);
    }

    public static void addConcepts() throws IOException, SQLException {
        File conceptFile = new File("data/semantics/database.txt");
        List<String> concepts = Files.readAllLines(conceptFile.toPath());
        Set<String> distinctConcepts = new HashSet<>();
        int cnt = 0;
        for (String line : concepts) {
            cnt += 1;
            if (cnt == 1) {
                continue;
            }
            String concept = line.split("\\t")[5];
            int index = concept.indexOf(":");
            if (index > 0) {
                concept = concept.substring(0, index);
            }
            distinctConcepts.add(concept);
        }

        for (String distinctConcept : distinctConcepts) {
            addNode(distinctConcept);
        }
    }

    public static void addRelations() throws IOException, SQLException {
        File relationFile = new File("data/semantics/database-relation.txt");
        List<String> relationships = Files.readAllLines(relationFile.toPath());
        Set<Relation> distinctRelation = new HashSet<>();
        Set<String> nodes = new HashSet<>();
        int cnt = 0;
        for (String line : relationships) {
            cnt += 1;
            if (cnt == 1) {
                continue;
            }
            String[] relationsInfo = line.split("\t");
            String type = relationsInfo[0];
            String source = relationsInfo[1];
            String target = relationsInfo[2];
            Relation relation = new Relation(source, target, type);
            if (type.equals("synonym") || type.equals("sibling")) {
                Relation backRelation = new Relation(target, source, type);
                distinctRelation.add(backRelation);
            }
            distinctRelation.add(relation);
        }
        for (Relation relation : distinctRelation) {
            String type = relation.type;
            if (!nodes.contains(relation.cp1)) {
                nodes.add(relation.cp1);
                addNode(relation.cp1);
            }
            if (!nodes.contains(relation.cp2)) {
                nodes.add(relation.cp2);
                addNode(relation.cp2);
            }
            addRelation(relation.cp1, relation.cp2, type);
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j", "");
        clear();
        addRelations();
        con.close();
    }
}
