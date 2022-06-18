package Students.VsevolodPravdin;

import java.util.Scanner;

public class Lesson6Methods {
    public static void main(String[] args) {
        String scan = myScan();
        String res = reversArray(scan);
        showStr(res);
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
}
