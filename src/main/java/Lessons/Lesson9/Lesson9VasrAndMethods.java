package Lessons.Lesson9;

public class Lesson9VasrAndMethods extends Object{
    static int id;
    static int id1;

    public String name;

    public Lesson9VasrAndMethods(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        id = 8;
        id1 = 10;
        Lesson9VasrAndMethods test3 = new Lesson9VasrAndMethods("Test3");
        test3.name = "Hi";
        method();
        methodSecond();

    }

    static void method() {
        // операторы
    }

    static void methodSecond() {
        //операторы
    }

    void method4() {

    }



}

class Test {

    { Lesson9VasrAndMethods test1 = new Lesson9VasrAndMethods("Test1");
        String str = test1.name;}


    public void method3() {
        Lesson9VasrAndMethods test = new Lesson9VasrAndMethods("Test");
        String name = test.name;
        test.method4();
    }
}


