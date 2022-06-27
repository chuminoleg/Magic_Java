package Students.LeonidLeo;

import java.util.Scanner;

public class HW_4_Optimized {

    public static void main(String[] args) {

        Methods methods = new Methods();

        System.out.println("Введите любую строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        methods.first(str);
        methods.second(str);
        methods.third(str);

    }
}

class Methods {
    public void first(String str) {
        System.out.println("эта строка считана первым методом");
    }

    public void second(String str) {
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println("  : эта же строка перевернута вторым методом");
    }

    public void third(String str) {
        System.out.println(str + "  -  а третий метод  поросто вывел ее на экран ");
    }
}