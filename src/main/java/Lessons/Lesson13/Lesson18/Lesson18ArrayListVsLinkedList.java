package Lessons.Lesson13.Lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson18ArrayListVsLinkedList {
    private static final int NUMBERS = 10_000;
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("Сравнение операции добавления add()");
        measureTimeAddOperation(arrayList);
        measureTimeAddOperation(linkedList);
        System.out.println();
        System.out.println("Сравнение операции получения get()");
        measureTimeGetOperation(arrayList);
        measureTimeGetOperation(linkedList);
        System.out.println();
        System.out.println("Сравнение операции добавления add(0, i)");
        measureTimeAddIn0(arrayList);
        measureTimeAddIn0(linkedList);
    }

    private static void measureTimeAddOperation(List<Integer> collection) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            collection.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(collection.getClass() + " " + (endTime - startTime) + " milliSeconds");
    }

    private static void measureTimeGetOperation(List<Integer> collection) {
        for (int i = 0; i < NUMBERS; i++) {
            collection.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBERS; i++) {
            collection.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(collection.getClass() + " " + (endTime - startTime) + " milliSeconds");
    }

    private static void measureTimeAddIn0(List<Integer> collection) {
          long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBERS; i++) {
            collection.add(0, i);           //          0    1    2    3
        } //ArrayList  [0][1][2][3]... add,    add(0, i) -> [2] ->[1]->[0]
        long endTime = System.currentTimeMillis();
        System.out.println(collection.getClass() + " " + (endTime - startTime) + " milliSeconds");
    }

}


