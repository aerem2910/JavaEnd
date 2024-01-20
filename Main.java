/*
 * Задание №4
  1. Напишите метод, на вход которого подаётся двумерный строковый массив
  размером 4х4. При подаче массива другого размера необходимо бросить
  исключениеMyArraySizeException.
  2. Далее метод должен пройтись по всем элементам массива, преобразовать в
  int и просуммировать. Если в каком-то элементе массива преобразование
  не удалось (например, в ячейке лежит символ или текст вместо числа),
  должно быть брошено исключение MyArrayDataException с детализацией, в
  какой именно ячейке лежат неверные данные.
  3. В методе main() вызвать полученный метод, обработать возможные
  исключения MyArraySizeException и MyArrayDataException и вывести
  результат расчета (сумму элементов, при условии что подали на вход
  корректный массив).
  
 */


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
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = 4;
        int columns = 4;

        if (array.length != rows || Arrays.stream(array).anyMatch(row -> row.length != columns)) {
            throw new MyArraySizeException("Incorrect array size. Expected 4x4.");
        }

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect data in cell [" + i + "][" + j + "].", e);
                }
            }
        }

        return sum;
    }
}


