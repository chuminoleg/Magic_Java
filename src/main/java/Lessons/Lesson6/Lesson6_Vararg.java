package Lessons.Lesson6;

public class Lesson6_Vararg {
    public static void main(String ... args) {
//    varArgTest();
        varArgTest(1, 2, 3, 4, 56, 567, 457, 457, 457, 457, 547, 457, 457, 345, 345, 345, -1);
        int[] array = {1, 2, 3, 4, 56, 567, 457, 457, 457, 457, 547, 457, 457, 345, 345, 345, -1};
        varArgTest(array);
    }

    static void varArgTest() {
    }

    static void varArgTest(int a) {
    }

    static void varArgTest(int a, int b) {
    }

    static void varArgTest(int a, int b, int c) {
    }



    static void varArgTest(String str, int c, int b) {

    }


    static void varArgTest(int ... number) {
        System.out.println("Число аргументов: " + number.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < number.length; i++) {
            System.out.println(" arg " + i + ": " + number[i]);
        }
        System.out.println();
    }

    static void varArgTest(String str1, boolean number, Object ... entity) {

    }

    static void varArgTest(int[]... number) {
    }

    @Override
    public String toString() {
        return "Lesson6_Vararg{}";
    }
}


