package Lessons.Lessons19_20_21marathon;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lesson22_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        printCollection(fillCollection(map));
        System.out.println();
        printCollection(fillCollection(linkedHashMap));
        System.out.println();
        printCollection(fillCollection(treeMap));

    }

    public static Map<Integer, String> fillCollection(Map<Integer, String> collection) {
        collection.put(39, "Bob");
        collection.put(12, "Mike");
        collection.put(0, "Tim");
        collection.put(1500, "Lewis");
        collection.put(7, "Tom");
        return collection;
    }

    public static void printCollection(Map<Integer, String> collection) {
        for (Map.Entry<Integer, String> entry : collection.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
