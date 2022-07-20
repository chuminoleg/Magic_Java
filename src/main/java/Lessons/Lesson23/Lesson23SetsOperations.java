package Lessons.Lesson23;

import java.util.Set;
import java.util.TreeSet;

public class Lesson23SetsOperations {
    public static void main(String[] args) {
        Set<Integer> treeSet1 = new TreeSet<>();
        fillCollection1(treeSet1);
        System.out.print("treeSet1: ");
        System.out.println(treeSet1);
        Set<Integer> treeSet2 = new TreeSet<>();
        fillCollection2(treeSet2);
        System.out.print("treeSet2: ");
        System.out.println(treeSet2);
        System.out.println();

        //объединение множеств
        Set<Integer> unionSet = new TreeSet<>(treeSet1);
        unionSet.addAll(treeSet2);
        System.out.print("Объединение множеств: ");
        System.out.println(unionSet);

        //пересечение множеств
        Set<Integer> intersectionSet = new TreeSet<>(treeSet1);
        System.out.print("Пересечение множеств: ");
        intersectionSet.retainAll(treeSet2);
        System.out.println(intersectionSet);

        //разность множеств
        Set<Integer> differenceSet = new TreeSet<>(treeSet1);
        System.out.print("Разность множеств: ");
        differenceSet.removeAll(treeSet2);
        System.out.println(differenceSet);

        treeSet1.clear();

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
}
