package Students.LeonidLukianchikov;

import java.util.Scanner;

public class Home_Work_Lesson4 {
    public static void main(String[] args) {
        int answer = 0;
        int[][] multiplication_table = new int[11][11];

        for (int i = 1; i < multiplication_table.length; i++) {
            for (int j = 1; j < multiplication_table[0].length; j++) {
                answer = i * j;
                multiplication_table[i][j] = answer;
                System.out.println(i + "*" + j + "=" + multiplication_table[i][j]);
            }
            System.out.println();
        }
    }
}

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] positive_numbers = new int[3][3];

        for (int i = 0; i < positive_numbers.length; i++) {
            for (int j = 0; j < positive_numbers[0].length; j++) {
                int number = scanner.nextInt();
                if (number % 1 == 0 && number > 0 && number < 100) {
                    positive_numbers[i][j] = number;
                } else {
                    System.out.println("Не подходит");
                }
            }
        }

        for (int i = 0; i < positive_numbers.length; i++) {
            for (int j = 0; j < positive_numbers[0].length; j++) {
                System.out.println(positive_numbers[i][j]);
            }
        }
    }
}

class Task3 {
    public static void main(String[] args) {
        int height = 10;
        int width = 20;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i != 0 && j != 0 && i != height - 1 && j != width - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }
}

