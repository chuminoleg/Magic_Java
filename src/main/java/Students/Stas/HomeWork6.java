package Students.Stas;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int number1 = scaner.nextInt();
        int number2 = scaner.nextInt();
        int number3 = scaner.nextInt();
        int number4 = scaner.nextInt();
        int number5 = scaner.nextInt();
        int number6 = scaner.nextInt();
        int number7 = scaner.nextInt();
        int number8 = scaner.nextInt();
        int number9 = scaner.nextInt();
        int number10 = scaner.nextInt();
        int MinNumber;
        MinNumber = number1;
        if (MinNumber > number2) {
            MinNumber = number2;
        }
        if (MinNumber > number3) {
            MinNumber = number3;
        }
        if (MinNumber > number4) {
            MinNumber = number4;
        }
        if (MinNumber > number5) {
            MinNumber = number5;
        }
        if (MinNumber > number6) {
            MinNumber = number6;
        }
        if (MinNumber > number7) {
            MinNumber = number7;
        }
        if (MinNumber > number8) {
            MinNumber = number8;
        }
        if (MinNumber > number9) {
            MinNumber = number9;
        }
        if (MinNumber > number10) {
            MinNumber = number10;
        }
        int MaxNumber;
        MaxNumber = number1;
        if (MaxNumber < number2) {
            MaxNumber = number2;
        }
        if (MaxNumber < number3) {
            MaxNumber = number3;
        }
        if (MaxNumber < number4) {
            MaxNumber = number4;
        }
        if (MaxNumber < number5) {
            MaxNumber = number5;
        }
        if (MaxNumber < number6) {
            MaxNumber = number6;
        }
        if (MaxNumber < number7) {
            MaxNumber = number7;
        }
        if (MaxNumber < number8) {
            MaxNumber = number8;
        }
        if (MaxNumber < number9) {
            MaxNumber = number9;
        }
        if (MaxNumber < number10) {
            MaxNumber = number10;
        }
        System.out.println(number1 * number2 * number3 * number4 * number5 * number6 * number7 * number8 * number9 * number10);
        System.out.println(number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10);
        System.out.println(MaxNumber);
        System.out.println(MinNumber);
    }
}
