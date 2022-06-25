package Students.IrinaGromik;
/* Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
 * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */
public class Task_001 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 2; i <numbers.length; i++) {
            numbers[i] = i;
        }
        for (int i = 2; i <numbers.length; i++) {
            int number = numbers[i];
            System.out.println(numbers[i]);
        }
    }
}
