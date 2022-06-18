package ClassWork;

import java.util.Scanner;

public class Lesson3_Switch_HM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println("Press P - продолжение, S - стоп, R - озобновить, Q - выйти");
        do{
            str = scanner.next();
            str = str.toUpperCase();
            switch (str){
                case ("Q"):
                    System.out.println();
                    break;
                case("P"):
                    System.out.println("Продрлжаем");
                    break;
                case("S"):
                    System.out.println("Стоп");
                    break;
                case ("R"):
                    System.out.println("Возобновить");
                    break;
                default:
                    System.out.println("Неверный код");
                    break;
            }
        } while (!str.equals("Q"));
    }
}
