package Lessons.Lesson5;

public class Lesson5_Caculator {
    public static void main(String[] args) {
        CalculatorMethods calc = new CalculatorMethods();
        System.out.println(calc.div(5, 0));
        System.out.println(calc.multi(5, 6));
        System.out.println(calc.sum(7, 9));
        System.out.println(calc.sub(7, 9));
    }
}

class CalculatorMethods {
//    void sum0(int a, int b) {
//        int s = a + b;
//    }
//
//    int sum1(int a, int b) {
//        int s1 = a + b;
//        return s1;
//    }

    Object sum(int a, int b) {
        return a + b;
    }

    int multi(int a, int b) {
        return a * b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int div(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на ноль!");
            return 0;
        } else {
            return a / b;
        }
    }
}
