package Students.LeonidLeo;
/**
 * [08.06.2022 19:59]
 * Написать три метода, первый умеет считывать с клавиатуры любую строку.
 * Второй метод способен развернуть любую строку зеркально (используем цикл и toCharArray от String).
 * Все методы должны вызываться в методе main (напоминаю методы, которые вызываются не на объекте, а из класса,
 * где создан main, необходимо, чтобы они были static или создавайте отдельный класс с методами и на объекте вызывайте
 * все три метода в main. Третий метод выводит любую строку на экран. Оба варианта помогут вам лучше познать принципы
 * создания и вызовы методов и объектов. StringBuilder.revers пользоваться нельзя!
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_001_08_06_22_Leonid_Leo {
    public static void main(String[] args) {
        printString(reverseString(readString())); // считываем строку, делаем reverse, выводим результат на экран
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in); // создаем объект класса Scanner
        String str = scanner.nextLine(); //считываем строку
        scanner.close(); // закрываем scanner
        return str; // возвращаем полученную строку из метода
    }

    // метод reverseString получает в качестве параметров строку и возвращает ее в зеркальном(обратном) порядке
    public static String reverseString(String str) {
        char[] arrayOfString = str.toCharArray();
        char temp; // временная переменная для обмена значениями между ячейками с начала и с конца
        for (int i = 0; i < arrayOfString.length / 2; i++) { // итерация идет до середины массива!
            temp = arrayOfString[i]; //сохранения значения из ячейки во временную переменную
            arrayOfString[i] = arrayOfString[arrayOfString.length - i - 1]; // запись в ячейку с начала значения из ячейки с конца
            arrayOfString[arrayOfString.length - i - 1] = temp; // запись из ячейки с начала (хранится в temp) в ячейку с конца
        }
        return new String(arrayOfString); // возврат reversed строки с преобразованием массива символов в строку
    }

    //printString получает в качестве параметров строку и выводит ее на консоль
    public static void printString(String str) { // получаем строку в параметрах
        System.out.println(str); // выводим строку на экран
    }
}