package AllProga;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArrayElements(correctArray);
            System.out.println("Sum of array elements: " + result);
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) {
        int rows = 4;
        int columns = 4;

        if (array.length != rows || Arrays.stream(array).anyMatch(row -> row.length != columns)) {
            throw new RuntimeException("Incorrect array size. Expected 4x4.");
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Incorrect data in cell [" + i + "][" + j + "].", e);
                }
            }
        }

        return sum;
    }
}

