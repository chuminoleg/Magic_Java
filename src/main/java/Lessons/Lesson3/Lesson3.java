package Lessons.Lesson3;
// данный класс создан для изучения циклов
public class Lesson3 {
    public static void main(String[] args) {
        int i = 0;
        boolean check = true;

        while(check) {
            System.out.print("Hallo JAVA ");
            break;
        }

        System.out.println();
        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.print("Hallo JAVA ");
            i++;
            break;
        }
    }
} // конец класса
