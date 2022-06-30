package Students.VsevolodPravdin;

import java.util.Scanner;

public class NewLesson6MethodsPalindrome {
    public static void main(String[] args) {
        String s = myScan();
        showStr(reversArray(s));
        showStr(isPalindrome(s));

    }


    static String myScan() {
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

    static String isPalindrome(String s) {
        s = s.replaceAll("\\s+", "");
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return "no palindrom";
            }
        }
        return "palindrom";
    }
}
