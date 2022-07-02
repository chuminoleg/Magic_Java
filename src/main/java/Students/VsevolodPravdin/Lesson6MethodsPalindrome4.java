package Students.VsevolodPravdin;

import java.util.Scanner;

public class Lesson6MethodsPalindrome4 {
    public static void main(String[] args) {
        String s = inputStr();
        showStr(isPalindrome(s, reversArray(s)));
    }

    static String inputStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input text");
        String str = scanner.nextLine();
        return str;
    }

    static String reversArray(String str) {
        String resultRevers = "";
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            resultRevers += arr[i];
        }
        return resultRevers;
    }

    static void showStr(String str) {
        System.out.println(str);
    }

    static String isPalindrome(String s, String s2) {
        s = s.replaceAll("\\s+", "");
        s2 = s2.replaceAll("\\s+", "");
        if (s.equalsIgnoreCase(s2)) {
            return "palindrome";
        }
        return "no palindrome";
    }
}