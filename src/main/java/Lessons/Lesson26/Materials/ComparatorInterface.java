package Lessons.Lesson26.Materials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    // используем только те коллекции, которые сохраняют порядок внесения объектов в коллекцию
    // List, TreeSet, TreeMap

    /**
     * воробей -> sparrow
     * синица -> titmouse
     * журавль -> crane (shadoof)
     * страус -> ostrich
     * утка -> duck
     */

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("sparrow");
        birds.add("titmouse");
        birds.add("shadoof");
        birds.add("ostrich");
        birds.add("duck");

        Collections.sort(birds); // статический метод sort
        System.out.println(birds);
        Collections.sort(birds, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        }); // статический метод sort
        System.out.println(birds);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(234);
        numbers.add(23);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2345);

        Collections.sort(numbers); // статический метод sort
        System.out.println(numbers);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < 2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }); // статический метод sort
        System.out.println(numbers);

        // порядок по умолчанию - естественный порядок natural order
        // если хотим отсортировать объекты по своему правилу
        // интерфейс Comparator -> для реализации логики сортировки объектов в коллекции

    }
}

class ComparatorByStringLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // o1 > o2 -> 1;
        // o1 < o2 -> -1;
        // o1 == o2 -> 0;
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class ComparatorReversedInteger implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < 2) {
            return 1;
        } else {
            return 0;
        }
    }
}