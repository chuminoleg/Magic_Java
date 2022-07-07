package Lessons.Lesson18.Materials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lesson18CompareArrayListVsLinkedList {
    public static void main(String[] args) {
        Integer numberX = new Integer(2);
        int y;
        y = (int) numberX;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("ArrayList Vs LinkedList in add operations");
        measureTimeAddOperation(arrayList);
        measureTimeAddOperation(linkedList);
        System.out.println();
        System.out.println("ArrayList Vs LinkedList in get operations");
        measureTimeGetOperation(arrayList);
        measureTimeGetOperation(linkedList);
        System.out.println();
        System.out.println("ArrayList Vs LinkedList in add to [0] operations");
        measureTimeAddIn0(arrayList);
        measureTimeAddIn0(linkedList);

    }

    private static void measureTimeAddOperation(List<Integer> listCollection) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            listCollection.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(listCollection.getClass() + " " + (endTime - startTime) + " milliSeconds");
    }

    private static void measureTimeGetOperation(List<Integer> listCollection) {
        for (int i = 0; i < 10_000; i++) {
            listCollection.add(i);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            listCollection.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(listCollection.getClass() + " " + (endTime - startTime) + " milliSeconds");
    }

    private static void measureTimeAddIn0(List<Integer> listCollection) {

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            listCollection.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(listCollection.getClass() + " " + (endTime - startTime) + " milliSeconds");
    }
}
