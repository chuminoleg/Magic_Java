package Lessons.Lesson13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать три метода, первый умеет считывать с клавиатуры любую строку.
 * Второй метод способен развернуть любую строку зеркально (используем цикл и toCharArray от String).
 * Все методы должны вызываться в методе main (напоминаю методы, которые вызываются не на объекте, а из класса,
 * где создан main, необходимо, чтобы они были static или создавайте отдельный класс с методами и на объекте вызывайте
 * все три метода в main. Третий метод выводит любую строку на экран. Оба варианта помогут вам лучше познать принципы
 * создания и вызовы методов и объектов. StringBuilder.revers пользоваться нельзя!
 */

public class Lesson13 {
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();
        stringMethods.printString(stringMethods.reverseString(stringMethods.readString()));
    }
}

class StringMethods {
    public String readString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    public String reverseString(String str) {
        char[] arrayOfString = str.toCharArray();
        char temp;
        for (int i = 0; i < arrayOfString.length / 2; i++) {
            temp = arrayOfString[i];
            arrayOfString[i] = arrayOfString[arrayOfString.length - i - 1];
            arrayOfString[arrayOfString.length - i - 1] = temp;
        }
        return new String(arrayOfString); // возврат reversed строки с преобразованием массива символов в строку
    }

    public void printString(String str) {
        System.out.println(str);
    }
}
