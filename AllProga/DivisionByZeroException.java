package AllProga;

public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException() {
        super("Error: Division by zero is not allowed.");
    }
}
