package Lessons.Lesson26;

public class LambdaSample {
    public static void main(String[] args) {
        Operationable operation;
        operation = (x, y) -> x + y;

        int result = operation.calculate(10,20);
        System.out.println(result);
    }
}

// функциональный интерфейс
interface Operationable {
    int calculate(int x, int y);
}

//class Calculator implements Operationable {
//
//    @Override
//    public int calculate(int x, int y) {
//        return x + y;
//    }
//}
