package Lessons.Lesson15.Materials;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("cat");
        list.add("frog");
        list.add("fish");

        Animal animal = new Animal();
        list.add(animal);

        String animalStr = (String) list.get(0);
        int age = (int) list.get(1);

        //c появление дженериков
        List<String> list2 = new ArrayList<String>();
        list2.add("cat");
        list2.add("frog");
        list2.add("fish");

        String animal2 = list2.get(2);
        // с появлением Java 7
        List<String> list3 = new ArrayList();
    }
}
