package Lessons.Lesson15;

public class Lesson15PrintF {
    public static void main(String[] args) {
        System.out.printf("Форматированный вывод целых чисел: %d %d%n", 778, 89);
        System.out.println();
        System.out.printf("Форматированный вывод целых чисел: %10d%n",  4565);
        System.out.printf("Форматированный вывод целых чисел: %10d%n",  3);
        System.out.printf("Форматированный вывод целых чисел: %10d\n",  23_523_522);
        System.out.printf("Форматированный вывод целых чисел: %10d\n",  -272_323_423);


        System.out.println();
        System.out.printf("Форматированный вывод вещественных чисел %16.3f%n", 3434.7823847384);
        System.out.printf("Форматированный вывод вещественных чисел %16.3f%n", 34543434.78324523);
        System.out.printf("Форматированный вывод вещественных чисел %16.3f%n", 34543434.782342342);
        System.out.printf("Форматированный вывод вещественных чисел %16.3f%n", 345645654434.7234234847384);

        System.out.printf("Форматированный вывод: %10d %f\n",   56.89, -272_323_423);
    }
}
