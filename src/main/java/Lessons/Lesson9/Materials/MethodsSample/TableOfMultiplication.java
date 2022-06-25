package Lessons.Lesson9.Materials.MethodsSample;

import java.util.Scanner;

public class TableOfMultiplication {
    public static void main(String[] args) {
        printArray(processArray(scanSizeOfMultiplTable()));
    }

    // статический метод который
    static int scanSizeOfMultiplTable() {
        Scanner scanner = new Scanner(System.in); //создаем объект и ссылочную переменную scanner
        int size = 0;
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Введи целое число от 1 до 20");
        }
        if (size == 0) {
            scanSizeOfMultiplTable();
        }  //рекурсия метода
        scanner.close();
        return size;
    }

    static int[][] buildArray(int size) {
        int[][] array2D = new int[size][size];
        return array2D;
    }

    static int[][] processArray(int size) {
        int[][] arrayProcess = buildArray(size);
        for (int i = 0; i < arrayProcess.length; i++) {
            for (int j = 0; j < arrayProcess[0].length; j++) {
                arrayProcess[i][j] = (i + 1) * (j + 1);
            }
        }
        return arrayProcess;
    }

    static void printArray(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int j = 0; j < arrayToPrint[0].length; j++) {
//                System.out.printf("03%d", arrayToPrint[i][j]);
                System.out.print(arrayToPrint[i][j] + " ");
            }
            System.out.println();
        }
    }
}
