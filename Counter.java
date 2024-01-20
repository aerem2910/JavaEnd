
//Задача 3


/*
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий
   значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
   такого типа можно было работать в блоке try-with-resources. Нужно бросить
   исключение, если работа с объектом типа счетчик была не в ресурсном try
   и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
   лучше всего
 */


/* 
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
            // Работаем с объектом Counter в блоке try
            counter.add();
            System.out.println("Value after adding: " + counter.getValue());
        } // Автоматически вызывается close()

        // Пример без использования try-with-resources
        Counter counterWithoutTryWithResources = new Counter();
        counterWithoutTryWithResources.add();
        System.out.println("Value without try-with-resources: " + counterWithoutTryWithResources.getValue());
        // Здесь мы должны явно вызвать close()
        counterWithoutTryWithResources.close();
    }
}
*/