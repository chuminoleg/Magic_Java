package Lessons.Lesson13;

/**
 * Задача 4. Читатели библиотеки.
 * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
 * <p>
 * ФИО,
 * номер читательского билета,
 * факультет,
 * дата рождения,
 * телефон.
 * Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 * - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В.
 * взял книги: Приключения, Словарь, Энциклопедия".
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя
 * и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 * Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
 * Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */

public class Lesson13_Task004_12_06_2022 {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        Reader reader4 = new Reader();
        Reader reader5 = new Reader();

        Reader[] arrayOfReaders = {reader1, reader2, reader3, reader4, reader5};

    }
}

class Reader {
    String name;
    int readerId;
    String dateOfBirth;
    int phoneNumber;

    public void takeBook(int booksTakenNumber, Reader name) {
        System.out.println(name + " " + booksTakenNumber);
    }

    public void takeBook(int booksTakenNumber) {
    }

    public void returnBook(int booksReturnNumber, Reader name) {
        System.out.println(name + " " + booksReturnNumber);
    }

    public void returnBook(int booksReturnNumber) {
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", readerId=" + readerId +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
