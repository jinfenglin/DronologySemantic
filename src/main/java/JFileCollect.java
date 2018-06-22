import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JFileCollect {
    List<File> jFiles;
    File rootDir;

    public JFileCollect(String rootPath) {
        rootDir = new File(rootPath);
        this.jFiles = new ArrayList<>();
    }

    private void getJavaFiles(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getJavaFiles(file);
            } else if (file.getName().endsWith(".java")) {
                jFiles.add(file);
            }
        }
    }

    public void getJavaFiles() {
        getJavaFiles(rootDir);
    }

    public void writeToData() throws IOException {
        File dataDir = new File("data/javaCode");
        for (File file : jFiles) {
            String targetPathStr = file.getAbsolutePath().toString().substring(rootDir.getAbsolutePath().length());
            targetPathStr = targetPathStr.replace("\\", "_");
            Path targetPath = Paths.get(dataDir.toString(), targetPathStr);
            Files.copy(file.toPath(), targetPath);
        }
    }

    public static void main(Concept[] args) throws IOException {
        String path = "F:\\projects\\Dronology";
        JFileCollect collector = new JFileCollect(path);
        collector.getJavaFiles();
        collector.writeToData();

    }
}
