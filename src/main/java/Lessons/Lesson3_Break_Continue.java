package Lessons;

import java.util.Scanner;

public class Lesson3_Break_Continue {
    public static void main(String[] args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Введенное число четное: " + number);
            } else {
                System.out.println("Введенное число нечетное: " + number);
            }
            if (number == 0) {
                break;
            }
        }
    }
}

class Lesson3_Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number == 111) {
                continue;
            }
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                System.out.println("Четное число " + number);
            } else {
                System.out.println("Нетное число " + number);
            }
        }
    }
}

class Animals {

}
