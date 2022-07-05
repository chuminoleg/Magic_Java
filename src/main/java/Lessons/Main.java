package Lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getIntNumber();
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


//        Scanner scaner = new Scanner(System.in);
//        String str = scaner.nextLine();
//        char[] array = str.toCharArray();
//        String str2 = " ";
//        for (int i = array.length - 1; i >= 0; i--) {
//            str2 = str2 + array[i];
//            String str3 = new String(str2);
//            System.out.println(str3);
//        }
//
//        final int a = 5, b = 8, c = 7;
//        // System.out.println(1);
//        // System.out.println(2);
//        // System.out.println(3);
//        // System.out.println(4);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        // System.out.println(8);
//        String word1 = scanner.next(); // "This"
//        String line1 = scanner.nextLine(); // " is a simple"
//        String word2 = scanner.next(); // "multiline"
//        String word3 = scanner.next(); // "input,"
//        String line2 = scanner.nextLine(); // ""

    }

    static void getIntNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println("Введено целое число: " + number);
        } else {
            System.out.println("Ведите целое число: ");
            getIntNumber(); // рекурсия
        }
        scanner.close();
    }
}
