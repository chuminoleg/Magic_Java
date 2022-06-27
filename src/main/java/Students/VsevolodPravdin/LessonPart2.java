package Students.VsevolodPravdin;

import java.util.Scanner;

public class LessonPart2 {
    public static void main(String[] args) {
        // task 4
        int a, b, c, result, arrSum = 0, arrMultiplication = 1;
        System.out.println("введите числа а и в");
        Scanner scaner = new Scanner(System.in);
        if (scaner.hasNextInt()) {
            a = scaner.nextInt();
            b = scaner.nextInt();
            result = a + b;
            System.out.println("a + b =" + result);
            result = a - b;
            System.out.println("a - b =" + result);
            result = a * b;
            System.out.println("a * b =" + result);
            result = a / b;
            System.out.println("a / b =" + result);
        } else {
            System.out.println("некорректный формат");
        }

        System.out.println();

        // task 5
        System.out.println("введите числа а в c");
        Scanner scaner1 = new Scanner(System.in);
        if (scaner1.hasNextInt()) {
            a = scaner1.nextInt();
            b = scaner1.nextInt();
            c = scaner1.nextInt();
            result = a * b * c;
            System.out.println("a * b * c = " + result);
            result = a + b + c;
            System.out.println("a + b + c = " + result);
            if (a < b && a < c) {
                System.out.println("меньшее число =" + a);
            } else if (b < c && b < a) {
                System.out.println("меньшее число =" + b);
            } else {
                System.out.println("меньшее число =" + c);
            }
        }

        // task 6-7
        int[] arr = new int[]{100, 20, 40, 50, 30, 60, 90, 80, 70, 10,};
        int arrMin = arr[0];
        int arrMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
            arrMultiplication *= arr[i];

            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
            if (arr[i] < arrMin) {
                arrMin = arr[i];
            }
        }
        System.out.println("сумма массива = " + arrSum);
        System.out.println("произведение чисел массива = " + arrMultiplication);
        System.out.println("arrmax = " + arrMax + "arrmin = " + arrMin);


    }
}
