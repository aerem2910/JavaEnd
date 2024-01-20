package AllProga;

import java.io.IOException;

public class ExceptionExample {

    public static void doSomething() throws IOException {
       
    }

    public static void main(String[] args) {
        try {
            doSomething();
            System.out.println("doSomething executed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
