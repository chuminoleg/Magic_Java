package Students.Stas;

import java.util.Scanner;

public class HomeWork_Task004_08_06_2022_Stas {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        char[] array = str.toCharArray();
        String str2 = " ";
        for (int i = array.length - 1; i >= 0; i--) {
            str2 = str2 + array[i];
            String str3 = new String(str2);
            System.out.println(str3);
        }
    }
}