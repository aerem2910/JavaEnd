package AllProga;

import java.io.FileNotFoundException;

public class NonexistentFileException extends FileNotFoundException {
    public NonexistentFileException(String fileName) {
        super("Error: The file '" + fileName + "' does not exist.");
    }
}
