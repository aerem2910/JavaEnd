package AllProga;

public class Counter implements AutoCloseable {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public void add() {
        value++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void close() throws IllegalStateException {
        if (value > 0) {
            throw new IllegalStateException("Resource not properly closed. Current value: " + value);
        }
    }

    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            System.out.println("Value after adding: " + counter.getValue());
        }

        Counter counterWithoutTryWithResources = new Counter();
        counterWithoutTryWithResources.add();
        System.out.println("Value without try-with-resources: " + counterWithoutTryWithResources.getValue());
        counterWithoutTryWithResources.close();
    }
}
