package Students.IrinaGromik;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;

/** Задача 4. Читатели библиотеки.
 Определить класс Reader, хранящий такую информацию о пользователе библиотеки:

 ФИО,
 номер читательского билета,
 факультет,
 дата рождения,
 телефон.
 Методы takeBook(), returnBook().
 Разработать программу, в которой создается массив объектов данного класса.
 Перегрузить методы takeBook(), returnBook():
 - takeBook, который будет принимать количество взятых книг.
 Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 - takeBook, который будет принимать переменное количество названий книг.
 Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 - takeBook, который будет принимать переменное количество объектов класса Book
 (создать новый класс, содержащий имя и автора книги).
 Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 Аналогичным образом перегрузить метод returnBook().
 Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
 Или  "Петров В. В. вернул 3 книги".
  */
public class Task_004 {
    public static void main(String[] args) {
        Reader Reader = new Reader("Чумин А.O.", 1, "5 класс", 26_12_2011, 123);
        Books book1 = new Books("автор", "Энциклопедия");
        Books book2 = new Books(" автор","Приключения");
        Books book3 = new Books("автор", "Словарь");
        Books[] array = {book1,book2,book3};
        Reader.takeBook(1);
        Reader.takeBook(1, array);
        Reader.returnBook(1, book1.bookName, book2.bookName, book3.name);


    }
}

class Reader {
    String fullName;
    int readnumber;
    String facultet;
    int birthDate;
    int phoneNumber;

    public Reader(String fullName, int readNumber, String facultet, int birthDate, int phoneNumber) {
        this.fullName = fullName;
        this.readnumber = readNumber;
        this.facultet = facultet;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    void takeBook() {
        System.out.println(fullName + " Взял 3 книги ");

    }

    void returnBook() {
        System.out.println(" вернул книги: ");

    }

    void takeBook(int readNumber) {
    System.out.println(fullName + " Взял 3 книги ");
    }

    void takeBook(int readNumber, Books[] books) {
        System.out.println(fullName + " Взял книги:" );
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();

    }

    void returnBook(int readNumber) {
        System.out.println(" вернул книги: ");

    }
    void returnBook(int readNumber, String...books) {
        System.out.println( fullName + " вернул книги: Приключения, Словарь, Энциклопедия");

    }
}

class Books {
    String name;
    String bookName;


    public Books(String name, String bookName) {
        this.name = name;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }


}

