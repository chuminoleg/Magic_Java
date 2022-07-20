package Lessons.Lesson23.Materials;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSets {
    public static void main(String[] args) {
//        Set<Integer> hashSet = new HashSet<>();
//        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1 = fillCollection1(treeSet1);
        Set<Integer> treeSet2 = new TreeSet<>();
        treeSet2 = fillCollection2(treeSet2);
        Set<Integer> union = new TreeSet<>(treeSet1);
        union.addAll(treeSet2);
        System.out.println(union);

//        treeSet1.clear();
//        treeSet2.clear();
    //sout

        Set<Integer> intersection = new TreeSet<>(treeSet1);
        intersection.retainAll(treeSet2);

        Set<Integer> diff = new TreeSet<>(treeSet1);
        diff.removeAll(treeSet2);
    }


    public static Set<Integer> fillCollection1(Set<Integer> collection) {
        collection.add(0);
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        return collection;
    }

    public static Set<Integer> fillCollection2(Set<Integer> collection) {
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        return collection;
    }

    public static void printSetCollection(Set<Integer> collection) {
        for (Integer element : collection) {
            System.out.println(element);
        }
    }
}
