package Students.LeonidLeo;

import java.util.Scanner;

public class HW_4 {

    public static void main(String[] args) {

        System.out.println("Проверьте как работают три разных метода, нажмите цифры от 1 до 3 ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if (a == 1) HW_4.first();
        if (a == 2) HW_4.second();
        if (a == 3) HW_4.third();

    }


    static void first() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любую строку");
        String str = scanner.nextLine();
        System.out.println("эта строка считана первым методом");


    }


    static void second() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для теста второго метоода  введите любую строку");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println("  : эта строка считана  и перевернута вторым методом");

    }


    static void third() {
        String str = "Test string";
        System.out.println(str + "  - третий метод  выводит просто любую строку");

    }


}
