package Students.ValentinSilchuk;

import java.util.Arrays;

public class Task_4_Library_Valentin_Silchuk {
    /**
     * Читатели библиотеки.
     * Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
     * ФИО,
     * номер читательского билета,
     * факультет,
     * дата рождения,
     * телефон.
     * Методы takeBook(), returnBook().
     * Разработать программу, в которой создается массив объектов данного класса.
     * Перегрузить методы takeBook(), returnBook():
     * - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
     * - takeBook, который будет принимать переменное количество названий книг.
     * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     * - takeBook, который будет принимать переменное количество объектов класса Book
     * (создать новый класс, содержащий имя и автора книги).
     * Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     * Аналогичным образом перегрузить метод returnBook().
     * Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
     * Или  "Петров В. В. вернул 3 книги".
     */
    public static void main(String[] args) {
        //массив объектов класса Reader
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров", 1, "IT", "01.05.1990", "89154561236");
        readers[1] = new Reader("Иванов", 2, "IT", "01.03.1970", "89167894521");
        readers[2] = new Reader("Сидоров", 3, "IT", "01.09.2000", "89262589842");
        readers[0].takeBook(3);// вызов метода с 1 аргументом
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");// вызов метода с переменным количеством аргументов
        //создание объектов класса Book
        Book book1 = new Book("Толстой", "Война и Мир");
        Book book2 = new Book("Пушкин", "Евгений Онегин");
        Book book3 = new Book("Достоевский", "Преступление и наказание");
        readers[2].takeBook(book1, book2, book3);// вызов метода с переменнымколичеством аргументов класса Book
        readers[0].returnBook(2);// вызов метода с 1 аргументом
        readers[1].returnBook("Словарь", "Энциклопедия");// вызов метода с переменным количеством аргументов
        readers[2].returnBook(book2, book3);// вызов метода с переменнымколичеством аргументов класса Book


    }

    static class Reader {
        //параметры класса Reader
        String name;
        int readerId;
        String faculty;
        String dateOfBirth;
        String phoneNumber;

        //методы класса Reader
        public void takeBook(int booksTakenNumber) {
            //метод с параметром количество взятых книг
            System.out.println(name + " взял " + booksTakenNumber + " книг/и. ");
        }

        void takeBook(String... books) {
            //метод с переменным количеством параметров - список взятых книг
            System.out.println(name + " взял книги: " + Arrays.toString(books));
        }

        void takeBook(Book... books) {
            //метод с переменным количеством параметров класса Book
            System.out.println(name + " взял книги: ");
            for (int i = 0; i < books.length; i++) {//вывод автор + название книги
                System.out.println(books[i].author + " " + books[i].bookName);
            }
            System.out.println();
        }

        public void returnBook(int booksTakenNumber) {
            //метод с параметром количество возвращенных книг
            System.out.println(name + " вернул " + booksTakenNumber + " книг/и. ");
        }

        void returnBook(String... books) {
            //метод с переменным количеством параметров - список возвращенных книг
            System.out.println(name + " вернул книги: " + Arrays.toString(books));
        }

        void returnBook(Book... books) {
            //метод с переменным количеством параметров класса Book
            System.out.println(name + " вернул книги: ");
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i].author + " " + books[i].bookName);
            }
            System.out.println();
        }

        public Reader(String name, int readerId, String faculty, String dateOfBirth, String phoneNumber) {
            //конструктор для класса Reader
            this.name = name;
            this.readerId = readerId;
            this.faculty = faculty;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
        }
    }

    static class Book {
        //параметры класса Book
        String author;
        String bookName;

        public Book(String author, String bookName) {
            //конструктор для класса Book
            this.author = author;
            this.bookName = bookName;
        }
    }

}