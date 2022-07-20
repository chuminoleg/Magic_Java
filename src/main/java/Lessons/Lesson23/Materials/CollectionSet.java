package Lessons.Lesson23.Materials;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class CollectionSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        printSetCollection(fillCollection(hashSet));
        System.out.println();
        printSetCollection(fillCollection(linkedHashSet));
        System.out.println();
        printSetCollection(fillCollection(treeSet));
        System.out.println();

        System.out.println(hashSet.contains("Tom")); // в Set работает очень быстро из-за хеширования
        System.out.println(hashSet.contains("Arsenii"));

        // обработка дубликатов в Set
        hashSet.add("Tom");
        hashSet.add("Tom");
        hashSet.add("Tom");



        printSetCollection(hashSet);

    }

    public static Set<String> fillCollection(Set<String> collection) {
        collection.add("Leonid");
        collection.add("Mark");
        collection.add("Gleb");
        collection.add("Arsenii");
        collection.add("Alena");
        collection.add("Viktor");
        return collection;
    }

    public static void printSetCollection(Set<String> collection) {
        for (String element : collection) {
            System.out.println(element);
        }
    }
}
