package AllProga;

public class EmptyArrayElementException extends RuntimeException {
    public EmptyArrayElementException() {
        super("Error: Attempt to access an element in an empty array.");
    }
}
