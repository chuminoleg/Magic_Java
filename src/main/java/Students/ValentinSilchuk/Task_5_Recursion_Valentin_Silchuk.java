package Students.ValentinSilchuk;

/**
 * Рекурсивный вывод чисел.
 * Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
 * или в порядке убывания в противном случае.
 * Использовать рекурсию
 */
public class Task_5_Recursion_Valentin_Silchuk {
    public static void main(String[] args) {
        recursion(20, 15);
        System.out.println();
        recursion(15,20);
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



