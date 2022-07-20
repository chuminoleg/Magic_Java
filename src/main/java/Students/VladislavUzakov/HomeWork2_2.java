package Students.VladislavUzakov;

public class HomeWork2_2
{
    public static void main(String[] args) {
        int a = 50;
        int b = 80;
        int c = 10;
        System.out.println(a + b + c);

        if (a < b && a < c) {
            System.out.println("Наименьшее число " + a);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее число " + b);
        } else {
            System.out.println("Наименьшее число " + c);
        }

    }
}
