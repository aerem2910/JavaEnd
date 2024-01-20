package AllProga;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {
    public static void copyFile(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(pathRead);
             BufferedWriter writer = Files.newBufferedWriter(pathWrite)) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
