package Students.IrinaGromik;

/**
 Задача 3. Класс Person
 Создать класс Person, который содержит:  переменные fullName, age;
 методы move() и talk(), в которых просто вывести на консоль сообщение
 -"Такой-то  Person говорит".
 Добавьте два конструктора  - Person() и Person(fullName, age).
 Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 другой - Person(fullName, age).
  */

public class Task_003 {
    public static void main(String[] args) {
        Person Person = new Person("Leonid", 6);
        Person.move(Person.fullName);
        Person.talk(Person.fullName, Person.age);

    }
}

class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    void move (String fullName) {
        System.out.println(fullName);

    }

    void talk (String fullName, int age) {
        System.out.println(fullName + " " + age + " лет "+ "говорит: ");

    }


}