package Lessons.Lesson25.Materials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson25Comparator {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("Sparrow");
        birds.add("Titmouse");
        birds.add("Parrot");
        birds.add("Zzzz");
        birds.add("Eagle");
        birds.add("Ostrich");
        birds.add("Duck");
        birds.add("DuckDuckDuckDuck");

        System.out.println(birds);
        Collections.sort(birds); // статический метод sort
        System.out.println(birds);
//        ComparatorStringByLength comparatorStringByLength = new ComparatorStringByLength();
//        Collections.sort(birds, comparatorStringByLength);
        Collections.sort(birds, new ComparatorStringByLength());
        System.out.println(birds);
        System.out.println();

//        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(234);
        numbers.add(23);
        numbers.add(5);
        numbers.add(234);
        numbers.add(1);
        numbers.add(5340);
        numbers.add(45);

        System.out.println(numbers);
        Collections.sort(numbers); // статический метод sort
        System.out.println(numbers);
        Collections.sort(numbers, new ComparatorReverseInteger());
        System.out.println(numbers);

        // порядок по умолчанию - естественный порядок natural order
        // если хотим отсортировать объекты по своему правилу
        // интерфейс Comparator -> для реализации логики сортировки объектов в коллекции
    }
}

class ComparatorStringByLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // o1 > o2 return 1;
        // o1 < o2 return -1;
        // o1 == o2 return 0;
        if(o1.length() > o2.length()) {
            return 1;
        } else if(o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;}
    }
}

class ComparatorReverseInteger implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // o1 > o2 return 1;
        // o1 < o2 return -1;
        // o1 == o2 return 0;
        if(o1 > o2) {
            return -1;
        } else if(o1 < o2) {
            return 1;
        } else {
            return 0;}
    }
}


