package Lessons.Lesson23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson23 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        printCollection(fillCollection(hashSet));
        System.out.println();
        printCollection(fillCollection(linkedHashSet));
        System.out.println();
        printCollection(fillCollection(treeSet));
        System.out.println();

    }

    public static Set<String> fillCollection(Set<String> collection) {
        collection.add("Leonid");
        collection.add("Mark");
        collection.add("Gleb");
        collection.add("Arsenii");
        collection.add("Alena");
        collection.add("Viktor");
        collection.add("Irina");

        return collection;
    }

    public static void printCollection(Set<String> collection){
        for (String element: collection) {
            System.out.println(element);
        }
    }
}
