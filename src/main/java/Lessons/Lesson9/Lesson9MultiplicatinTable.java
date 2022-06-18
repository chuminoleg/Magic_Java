package Lessons.Lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Класс, который содержит три метода
 * 1. - получает размер таблицы умножения
 * 2. - создает сущность - двухмерный массив
 * 3. - заполняет массив данными согласно размеру таблицы умножения
 * 4. - вывод результата (массива) на экран
 */
public class Lesson9MultiplicatinTable {
    public static void main(String[] args) {
        printArray(processArray(scanSizeOfMultiTable()));
    }

    static int scanSizeOfMultiTable() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        System.out.println("Пожалуйста введите любое положительное целое число от 1 ... 100 :");

        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Неправильный ввод!");
            size = 0;
        }

        if (size == 0) {
            scanSizeOfMultiTable();
        }
        return size;
    }

    static int[][] buildArray(int size) {
        int[][] array2D = new int[size][size];
        return array2D;
    }

    static int[][] processArray(int size) {
        int[][] arrayToProcess = buildArray(size);
        for (int i = 0; i < arrayToProcess.length; i++) {
            for (int j = 0; j < arrayToProcess[0].length; j++) {
                arrayToProcess[i][j] = (i + 1) * (j + 1);
            }
        }
        return arrayToProcess;
    }

    static void printArray(int[][] arrayToProcess) {
        for (int i = 0; i < arrayToProcess.length; i++) {
            for (int j = 0; j < arrayToProcess[0].length; j++) {
                System.out.print(arrayToProcess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
