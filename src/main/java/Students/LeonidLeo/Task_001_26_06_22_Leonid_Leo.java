package Students.LeonidLeo;
/**
 Задача 1 от 26.06.2022 для всех. Написать на базе этой программы Task_001_08_06_2022_Leonid_Leo код
 который определяет, является ли слово палиндромом (Слово или фраза, которые одинаково читаются слева направо и
 справа налево.
 */

import java.util.Scanner;

public class Task_001_26_06_22_Leonid_Leo {

    public static void main(String[] args) {

        String str1 = inputStr();
        String str2 = reverse(str1);
        checkerIfPalindrom(str1, str2);
    }

    public static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace(" ", "");
        return str;
    }

    public static String reverse(String str) {
        char[] str2char = str.toCharArray();
        char temp;
        for (int i = 0; i < str2char.length / 2; i++) {
            temp = str2char[i];
            str2char[i] = str2char[str2char.length - i - 1];
            str2char[str2char.length - i - 1] = temp;
        }
        return new String(str2char);
    }

    public static void checkerIfPalindrom(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            System.out.println("это палиндром ");
        } else {
            System.out.println("это нифига не палиндром");
        }

    }
}







