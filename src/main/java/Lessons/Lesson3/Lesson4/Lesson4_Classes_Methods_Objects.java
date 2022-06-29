package Lessons.Lesson3.Lesson4;

public class Lesson4_Classes_Methods_Objects {
    public static void main(String[] args) {
        Person client1 = new Person();
        client1.passportNumber = 98789897;
        client1.age = 32;
        client1.name = "Leon";
        client1.surName = "Ivanov";
        client1.checkIfClient = true;

        Person client2 = new Person();
        client2.passportNumber = 123198797;
        client2.age = 23;
        client2.name = "Maria";
        client2.surName = "Petrova";
        client2.checkIfClient = false;

        Person client3 = new Person();
        client3.passportNumber = 45549897;
        client3.age = 45;
        client3.name = "Max";
        client3.surName = "Sidorov";
        client3.checkIfClient = true;

        client1.say();
        client1.tell();
        client2.say();
        client2.tell();
        client3.say();
        client3.tell();

        System.out.println(client2.write("---", 45));
    }
}

class Person {
    int passportNumber;
    int age; // поле == переменная == константа
    String name;
    String surName;
    boolean checkIfClient;

    void say() {
        System.out.println("Привет");
    }

    void tell() {
        System.out.println("Меня зовут: " + name + ", моя фамилия: " + surName + ", мне: " + age + " лет");
    }

    String write(String str, int age) {

        return str;
    }
}
