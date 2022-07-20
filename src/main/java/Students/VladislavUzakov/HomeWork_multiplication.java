package Students.VladislavUzakov;

import java.util.Scanner;

public class HomeWork_multiplication {

    public static void main(String[] args) {
        int answer = 0;
        int[][] multiplication_table = new int[11][11];

        for (int i = 1; i < multiplication_table[0].length; i++) {
            for (int j = 1; j < multiplication_table.length; j++) {
                answer = i * j;
                multiplication_table[i][j] = answer;
                System.out.println(i + "*" + j + "=" + multiplication_table[i][j]);
            }
            System.out.println();
        }
    }
}


class Home_work4_1 {
    public static void main(String[] args) {
        System.out.println("Введите числа от 0 до 100");
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[3][3];
        for (int i = 0; i < numbers[0].length; i++) {
            for (int j = 0; j < numbers.length; j++) {
            int number = scanner.nextInt();
            if (number%1 == 0 && number >= 0 && number <= 100){
                numbers[i][j] = number;
            }else {
                System.out.println("Ваше число вне разрешеного диапазона");
            }
            }
        }
        for (int i = 0; i < numbers[0].length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}


class HomeWork4_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 20; j++) {
                if (i == 0 || i == 10) {
                    System.out.print("Б");
                }
                else {
                    if (j == 0 || j == 20) {
                        System.out.print("Б");
                    }else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//        for (int i = 0; i < height; i++) {   <------Это я взял для примера
//            for (int j = 0; j < width; j++) {
//                if (i != 0 && j != 0 && i != height - 1 && j != width - 1) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("Б");
//                }
//            }
//            System.out.println();
//        }
    }


