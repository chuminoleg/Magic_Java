package Lessons;

import java.util.Scanner;

public class Lesson2_PrimitiveTypes {

    public static void main(String[] args) {
        final int MAX_VALUE = 10;
        // целочисленные примитивы
        byte a = 0;
        byte ert;
        short b = 12;
        b = a;
        int c = 20_000_000;
        long d = -234523;
        d = b;

        c = (int) d;

        //примитивы вещественные
        float e = 2.33f;
        float e1 = 2.33F;
        double f = 4.232352;

        char h = '@';

        boolean g = true; // по умолчанию инициализируется как false

        // Типы обертки
        Byte A = a;
        Short B = b;
        Integer С = c;
        Long D = d;


        Float E = e;
        Double F = f;

        Character H = h;

        Byte minByte = Byte.MIN_VALUE;
        Byte maxByte = Byte.MAX_VALUE;

        Integer minInteger = Integer.MIN_VALUE;
        Integer maxInteger = Integer.MAX_VALUE;

        Character chr = Character.MAX_VALUE;
//        System.out.println(minInteger + " " + maxInteger);
//        System.out.println(chr);

        String str = "Hallo";
        String str1 = "a";
        String str2 = "" + 'a';

//        System.out.println("Я помню чудное мгновенье:\n" +
//                "Передо мной явилась ты,\n" +
//                "Как мимолетное виденье,\n" +
//                "Как гений чистой красоты.\n" +
//                "\n" +
//                "В томленьях грусти безнадежной,\n" +
//                "В тревогах шумной суеты,\n" +
//                "Звучал мне долго голос нежный\n" +
//                "И снились милые черты.\n" +
//                "\n" +
//                "Шли годы. Бурь порыв мятежный\n" +
//                "Рассеял прежние мечты,\n" +
//                "И я забыл твой голос нежный,\n" +
//                "Твои небесные черты.");
        // String - ссылочный тип
        Scanner scanner = new Scanner(System.in);
//        String str5 = scanner.nextLine(); // считывает всю строку
        int number = scanner.nextInt();
//    String str6 = scanner.next(); // считывает только слово
        System.out.println();
        System.out.println(number);

    }
}
