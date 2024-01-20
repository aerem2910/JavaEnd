/* 
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

    public static void main(String[] args) {
        Path sourcePath = Paths.get("path/to/source.txt");
        Path destinationPath = Paths.get("path/to/destination.txt");

        try {
            copyFile(sourcePath, destinationPath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
*/

//Задача 1