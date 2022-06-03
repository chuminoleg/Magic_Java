package Students.IrinaGromik;

import java.util.Scanner;

public class Homework1 {

    public Homework1() {
    }

    public static void main(String[] args) {

        final int MAX_VALUE = 100;
        byte a = 1;
        byte ert;
        short b = 202;
        b = a;
        int c = 10_000_000;
        long d = -23403;
        d = b;

        c = (int) d;

        float e = 3.54f;
        float e1 = 3.33F;
        double f = 5.232352;
        char h = '@';

        boolean g = true;

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

        System.out.println(minInteger + " " + maxInteger);
        System.out.println(chr);

        String str = "Hallo";
        String str1 = "a";
        String str2 = "" + 'a';

        System.out.println("Рассвет в горах, и солнца паутина\n" +
                "Сквозь вату, набежавших облаков,\n" +
                "Накроет бок проснувшейся вершины,\n" +
                "С другого бока – сумрака покров.\n" +
                "Светает быстро, хмурый сумрак тает,\n" +
                "Вдали виднеется двуглавая гора.\n");
    }

}
