package Lessons.Lesson3;

public class Lesson3_Do_While {
    public static void main(String[] args) {
        boolean check = true;

        do {
            System.out.println("Hallow Java");
        } while (check);

        while(check) {
            System.out.println("Hallow Java");
        }

        int[] array = new int[10];

        for (int element : array) {
            System.out.println(element);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
