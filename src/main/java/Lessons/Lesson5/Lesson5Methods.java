package Lessons.Lesson5;

public class Lesson5Methods {
    public static void main(String[] args) {
        String name1 = "Maria";
        String surname1 = "Petrova";

    MethodsClass methods = new MethodsClass();
    methods.method1();
    methods.method2("Ivan", "Ivanov");
    methods.method2(name1, surname1);
    }
}

class MethodsClass {
    final int FIELD_SIZE = 100;
    int number;

    void method1() {
        System.out.println("Простой метод");
        System.out.println(FIELD_SIZE);
    }

    void method2(String n, String s) {
        System.out.println("My name is " + n + " " + s);
    }
}