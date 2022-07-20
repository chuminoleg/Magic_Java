package Students.VladislavUzakov;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        int priceUsb64 = 300;
        int priceUsb128 = 350;
        int priceUsb256 = 380;
        int priceSd64 = 290;
        int priceSd128 = 350;
        int priceSd256 = 370;
        int benefitUsb64 = 590;
        int benefitUsb128 = 790;
        int benefitUsb256 = 990;
        int benefitSd64 = 590;
        int benefitSd128 = 790;
        int benefitSd256 = 990;
        int delyvery = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        System.out.println("Калькулятор закупа и выгоды2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Колличество  Usb 64 GB");
        a = scanner.nextInt();
        System.out.println("Колличество  Usb 128 GB");
        b = scanner.nextInt();
        System.out.println("Колличество  Usb 256 GB");
        c = scanner.nextInt();
        System.out.println("Колличество  Sd 64 GB");
        d = scanner.nextInt();
        System.out.println("Колличество  Sd 128 GB");
        e = scanner.nextInt();
        System.out.println("Колличество  Sd 256 GB");
        f = scanner.nextInt();
        System.out.println("Usb 64 GB - " + a + " шт.");
        System.out.println("Usb 128 GB - " + b + " шт.");
        System.out.println("Usb 256 GB - " + c + " шт.");
        System.out.println("Sd 64 GB - " + d + " шт.");
        System.out.println("Sd 128 GB - " + e + " шт.");
        System.out.println("Sd 256 GB - " + f + " шт.");
        int price = ((a * priceUsb64) + (b * priceUsb128) + (c * priceUsb256) + (d * priceSd64) + (e * priceSd128) + (f * priceSd256));
        int benefit = ((a * benefitUsb64) + (b * benefitUsb128) + (c * benefitUsb256) + (d * benefitSd64) + (e * benefitSd128) + (f * benefitSd256));
        System.out.println("Цена: " + price + "Рублей.");
        System.out.println("Цена доставки");
        delyvery = scanner.nextInt();
        scanner.close();
        System.out.println("Выгода: " + (benefit - (price + delyvery)) + "Рублей.");


    }
}
