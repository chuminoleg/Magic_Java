package Students.Ilias_Plih.ValentinSilchuk;

/*(На повторение массивов)???. Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.*/
public class Task_1_PrimeNumbers_Valentin_Silchuk {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean NumberIsPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    NumberIsPrime = false;
                    break;
                }
            }
            if (NumberIsPrime) {
                System.out.println(i);
            }
        }
    }
}
