package Lessons;

import java.util.Scanner;

public class Lesson6 {

    public static void main(String[] args) {
        printString(readString());
    }

    static String readString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    static String reverseString(String str) {
        char[] arrayOfChar = str.toCharArray();
        for (int i = 0; i < arrayOfChar.length / 2; i++) {
            char temp = arrayOfChar[i];
            arrayOfChar[i] = arrayOfChar[arrayOfChar.length-1];
            arrayOfChar[arrayOfChar.length-1] = temp;
        }
        // arrayOfChar -> String
        return str;
    }

    static void printString(String str) {
        System.out.println(str);
    }



}

class Pet {

}
