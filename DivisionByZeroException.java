
/*
 * Задание №3
  1. Создайте класс исключения, который будет выбрасываться при делении на 0.
  исключение должно отображать понятное для пользователя сообщение
  об ошибке.
  2. Создайте класс исключений, которое будет возникать при обращении к
  элементу в массиве ссылочного типа. Исключение должно
  отображать понятное для пользователя сообщение об ошибке
  3. Создайте класс исключения, которое будет возникать при попытке открыть
  несуществующий файл. Исключение должно отображать понятное для
  пользователя сообщение об ошибке.
 */


/* 
public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException() {
        super("Error: Division by zero is not allowed.");
    }
}
*/

/* 
public class EmptyArrayElementException extends RuntimeException {
    public EmptyArrayElementException() {
        super("Error: Attempt to access an element in an empty array.");
    }
}

/* 
import java.io.FileNotFoundException;

public class NonexistentFileException extends FileNotFoundException {
    public NonexistentFileException(String fileName) {
        super("Error: The file '" + fileName + "' does not exist.");
    }
}
*/