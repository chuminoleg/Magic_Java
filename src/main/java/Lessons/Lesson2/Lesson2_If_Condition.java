package Lessons.Lesson2;

import java.util.Scanner;

public class Lesson2_If_Condition {
    public static void main(String[] args) {
        int a = 0, b = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Неверный формат вводимых данных");
        }

        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Неверный формат вводимых данных");
        }


        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a < b");
        }



//        if (a >= b ) {System.out.println();
//        System.out.println();}
//        else System.out.println();
    }
}
