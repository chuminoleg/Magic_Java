package Lessons.Lesson11.Materials;

public class Lesson10Generics {
    public static void main(String[] args) {
        Lesson10Generics entity = new Lesson10Generics();
        entity.method(" Hi");
        entity.method(78);
        entity.method(true);
        entity.<Integer>method(34);
    }

    public <T> T method(T variable) {
        return variable;
    }
    public <T> void method2(T variable) {
    }

    public <T, U, K, F> void method3(T variable, U variableU, K variableK, F variableF) {
    }
}

