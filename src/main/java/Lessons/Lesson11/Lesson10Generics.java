package Lessons.Lesson11;

public class Lesson10Generics {
    public static void main(String[] args) {
        Lesson10Generics generics = new Lesson10Generics();
        generics.<String>method("JAVA");
        generics.<Integer>method(56);
        generics.<Character>method('c');
        generics.method1("String"); //--> возвращает String
        generics.method1(100); //--> возвращает целое число
        generics.method2("One", "Two", "Three");
        generics.<Integer, String, String>method2(1993, "Java", "Oak");
    }

    <T> void method(T variable) {

    }

    <T> T method1(T variable) {
        return variable;
    }


    <T, U, K> T method2(T variable) {
        return variable;
    }

    <T, U, K> T method2(T variableT, U variableU) {
        return variableT;
    }

    <T, U, K> U method2(T variableT, U variableU, K variableK) {
        return variableU;
    }

}
