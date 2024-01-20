//Задача 2

/*
 * Создайте метод doSomething(), который может быть источником одного из
   типов checked exceptions (тело самого метода прописывать не обязательно).
   ызовите этот метод из main и обработайте в нем исключение, которое
   вызвал метод doSomething().
 */

 /* 
 import java.io.IOException;

 public class ExceptionExample {
 
     // Метод, который может генерировать checked exception
     public static void doSomething() throws IOException {
         // Тело метода (здесь может быть вызван код, генерирующий IOException)
     }
 
     public static void main(String[] args) {
         try {
             // Вызов метода doSomething, который может генерировать IOException
             doSomething();
             System.out.println("doSomething executed successfully.");
         } catch (IOException e) {
             System.err.println("Error: " + e.getMessage());
             // Здесь вы можете добавить дополнительную логику обработки исключения
         }
     }
 }
 */