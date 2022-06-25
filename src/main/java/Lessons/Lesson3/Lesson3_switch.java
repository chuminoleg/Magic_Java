package Lessons.Lesson3;

import java.util.Locale;
import java.util.Scanner;

public class Lesson3_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println("Press P - продолжение, S - стоп, R - возобновить, Q - выйти");
        do {
            str = scanner.next();
            str = str.toUpperCase();
            switch (str) {
                case ("P"):
                    System.out.println("Продолжаем");
                    break;
                case ("S"):
                    System.out.println("СТОП");
                    break;
                case ("R"):
                    System.out.println("Возобновить");
                    break;
                default:
                    System.out.println("Неверный ввод!");
                    break;
            }
        } while (!str.equals("Q"));
    }
}
