package Lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
//        int sum = x + y + z;
//        if (sum % 2 == 0) {
//            System.out.println(sum / 2);
//        } else {
//            System.out.println(sum / 2 + 1);
//        }
//        int a = 300;
//        int b = a++;
//        int c = --b;
//        System.out.println(b);
//        System.out.println(c);

//        boolean check = false;
////        int x = scanner.nextInt();
////        if (x > 0 && x < 10) {
////            check = true;
////            System.out.println(check);
////        } else {
////            System.out.println(check);
////        }

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
