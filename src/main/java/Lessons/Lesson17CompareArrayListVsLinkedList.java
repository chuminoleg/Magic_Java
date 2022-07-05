package Lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson17CompareArrayListVsLinkedList {
    public static void main(String[] args) {
        Integer numberX = new Integer(2);
        int y;
        y = (int) numberX;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        measureTime(arrayList);
        measureTime(linkedList);
    }

    private static void measureTime(List<Integer> listCollection) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            listCollection.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
