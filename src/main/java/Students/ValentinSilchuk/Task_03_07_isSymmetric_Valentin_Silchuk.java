package Students.ValentinSilchuk;
/**Получив четырехзначное число, определите, симметрична ли его десятичная нотация.
 Если число симметрично, выведите 1; в противном случае выведите любое другое целое число.*/
import java.util.Scanner;

public class Task_03_07_isSymmetric_Valentin_Silchuk {
    public static void main(String[] args) {
//    final int divide1000 = 1000;
//    final int divide100 = 100;
//    final int divide10 = 10;
//    final int isSymmetric = 1;
//    final int notSymmetric = 37;
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int firstTwoDigits = number /100;//получаем первые две цифры числа
    int lastTwoDigits = number % 100;//получаем последние две цифры числа
        if (firstTwoDigits/10 == lastTwoDigits%10 && firstTwoDigits%10 == lastTwoDigits/10) {
            System.out.println(1);
        }else{
            System.out.println(69);
        }
//    int digit1000 = number / divide1000;
//    int digit100 = (number - digit1000 * divide1000) / divide100;
//    int digit10 = (number - digit1000 * divide1000 - digit100 * divide100) / divide10;
//    int digit0 = number - digit1000 * divide1000 - digit100 * divide100 - digit10 * divide10;
//    if (digit1000 == digit0 && digit100 == digit10) {
//        System.out.println(isSymmetric);
//    } else {
//        System.out.println(notSymmetric);
//    }
}
}
