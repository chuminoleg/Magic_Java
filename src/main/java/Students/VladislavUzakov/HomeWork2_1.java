package Students.VladislavUzakov;

import java.util.Scanner;

public class HomeWork2_1 {

    public static void main(String[] args) {
        byte a;
        a = 127;
        short b;
        b = 1_052;
        int c;
        c = 14_411;
        long d;
        d = 756_321;
        float e;
        e = 33.333f;
        double f;
        f = 9.75632;
        char s = '&';
        boolean r = true;

        Byte A = a;
        Short B = b;
        Integer C = c;
        Long D = d;
        Float E = e;
        Double F = f;

        String g;
        g = "Home work";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(s);
        System.out.println(r);
        System.out.println(g);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println();
        System.out.println();
        System.out.println("Введите два целых числа:");

        int z=0,x=0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            z = scanner.nextInt();
        }else {
            System.out.println("Введите число");
        }
        if (scanner.hasNextInt()){
            x = scanner.nextInt();
        }else {
            System.out.println("Введите число");
        }

        System.out.println(z + x);
        System.out.println(z - x);
        System.out.println(z * x);
        System.out.println(z / x);
        System.out.println();
        System.out.println();
        System.out.println("");
    }
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println(a + b);
//    }
//




}
