package Students.LeonidLeo;
/**
 * Первая строка входа содержит высоту автобуса и количество мостов, под которыми проходит автобус.
 * Вторая линия содержит высоты этих мостов.
 * ы должны вывести «Не рухнет», если все будет в порядке; в противном случае выведите «Врежется в мост i»
 * (где i — номер моста), в который врежется автобус. Если высота моста равна высоте автобуса, автобус разобьется.
 * Пример входных данных 1:
 * 234 8
 * 465 453 981 463 1235 871 475 981
 * Пример выходных данных 1:
 * Will not crash
 * Пример входных данных 2:
 * 211 5
 * 871 205 123 871 1681
 * Пример выходных данных 2:
 * Will crash on bridge 2
 */


import java.util.Scanner;

public class Task_001_14_07_22_Leonid_Leo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int height = scanner.nextInt();
        int count = scanner.nextInt();
        scanner.nextLine();
//        System.out.println();
        String str = scanner.nextLine();
        stringToIntArray(height, count, str);
    }

    static void stringToIntArray(int height, int count, String str) {
        String[] strArray = str.split(" ");
        int[] array = new int[count];
        int counter = 0;
        boolean check = true;
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        for (int j : array) {
            if (j > height) {
                counter++;
            }
            if (j <= height) {
                counter++;
                System.out.println("will crush at bridge " + counter);
                check = false;
                break;
            }
        }
        if (check) System.out.println("will not crush");
    }
}
























