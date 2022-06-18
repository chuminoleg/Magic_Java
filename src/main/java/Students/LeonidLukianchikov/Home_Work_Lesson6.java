package Students.LeonidLukianchikov;

import java.util.Scanner;

public class Home_Work_Lesson6 {
    public static void main(String[] args) {
        text_input();
    }
    static void text_input() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        mirror_text(str);
    }

    static void mirror_text(String str) {
        char[] mirror_array = str.toCharArray();
        String replacement = "";
        for (int i = mirror_array.length - 1; i >= 0; i--) {
            replacement += mirror_array[i];
        }
        text_output(replacement);
    }

    static void text_output(String str) {
        System.out.println(str);
    }
}
