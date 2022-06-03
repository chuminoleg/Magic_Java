package Students.VsevolodPravdin;

import java.util.Scanner;

public class Lesson3_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        boolean exit = true;
        System.out.println("Press P - продолжение, S - стоп, R - возобновить, Q - выйти");
        while (exit) {
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
                case ("Q"):
                    System.out.println("досвидания");
                    exit = false;
                    break;
                default:
                    System.out.println("Неверный ввод!");
                    break;
            }
        }
    }
}
