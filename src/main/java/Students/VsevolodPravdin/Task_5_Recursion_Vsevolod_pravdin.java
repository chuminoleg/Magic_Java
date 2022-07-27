package Students.VsevolodPravdin;

public class Task_5_Recursion_Vsevolod_pravdin {
    public static void main(String[] args) {
        recursion(10, 25);
        System.out.println();
        recursion(5, 10);
    }

    public static int recursion(int a, int b) {
        if (a > b) {
            if (a == b) {
                System.out.println(a);
                return a;
            } else {
                System.out.println(a);
                return recursion(a - 1, b);
            }
        } else {
            if (a == b) {
                System.out.println(a);
                return a;
            } else {
                System.out.println(a);
                return recursion(a + 1, b);
            }
        }
    }
}