package Students.LeonidLeo;
/*
Задача от 24.07.2022 Написать программу, у которой есть методы считывания данных типа Integer, с обязательной проверкой
что входные данные соответствуют запрашиваемому типу, далее сохранение в динамический массив, условие остановки считывания данных слово "STOP"
(ignoreCase!). Есть методы сортировки от меньшего к большему и от большего к меньшему (для сортировки запрограммировать пузырьковую сортировку)
и есть вывод на экран данных массива.
Минимальное количество входных данных 20 чисел. Можно использовать генератор случайных чисел (класс Random) и не считывать их с клавиатуры.
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task_001_24_07_22_Leonid_Leo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> listOfInt = new ArrayList<>();
        System.out.println("Type 'R', if you need randomize method, or input  minimum " +
                "20 numbers manually and then input 'STOP'  ");
        if (scanner.nextLine().equalsIgnoreCase("R"))
            bubbleSorterDecrement(bubbleSorterIncrement(readRandomInteger(listOfInt)));
        else bubbleSorterDecrement(bubbleSorterIncrement(readInteger(listOfInt)));
    }


    static public ArrayList<Integer> readRandomInteger(ArrayList<Integer> list) {
        boolean check = true;
        int counter = 0;
        Random random = new Random();
        while (counter < 20) {
            list.add(random.nextInt(20)); // ограничил разброс
            counter++;
        }
        System.out.println(list + "  :   array is full");
        return list;

    }


    static public ArrayList<Integer> readInteger(ArrayList<Integer> list) {
        boolean check = true;
        int counter = 0;
        while (check) {
            if (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
                counter++;
            }
            if (scanner.nextLine().equalsIgnoreCase("stop") && counter > 20) {
                check = false;
                System.out.println(list + "  :   array is full");
            }
        }
        return list;
    }

    static public ArrayList<Integer> bubbleSorterIncrement(ArrayList<Integer> list) {
        int temp = 0;
        boolean nonSorted = true;
        while (nonSorted) {
            nonSorted = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    nonSorted = true;
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        System.out.println(list + "  :   sorted  ---->  ");
        return list;
    }

    static public ArrayList<Integer> bubbleSorterDecrement(ArrayList<Integer> list) {
        int temp = 0;
        boolean nonSorted = true;
        while (nonSorted) {
            nonSorted = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    nonSorted = true;
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        System.out.println(list + "  :   sorted  <----  ");
        return list;
    }
}
