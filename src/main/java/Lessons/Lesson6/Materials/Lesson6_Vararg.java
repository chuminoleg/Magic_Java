package Lessons.Lesson6.Materials;

public class Lesson6_Vararg {
    public static void main(String[] args) {
    vaTest(1, 2, 3, 4, 5, 6, 8, 9);
    }

    static void vaTest(int ... v) {
        System.out.println("Число аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }
}
