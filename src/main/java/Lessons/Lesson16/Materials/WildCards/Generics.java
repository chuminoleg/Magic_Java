package Lessons.Lesson16.Materials.WildCards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generics {
    public static void main(String[] args) {
        // было до Java 5
        List arrayListOfAnimals = new ArrayList();
        arrayListOfAnimals.add("cat");
        arrayListOfAnimals.add("dog");
        arrayListOfAnimals.add("duck");
        arrayListOfAnimals.add("sheep");
        arrayListOfAnimals.add(32432); //<---

        // String animal = arrayListOfAnimals.get(0); <- DownCasting from Object
        String animal = (String) arrayListOfAnimals.get(0);

        Random randomNumber = new Random();

        List<String> animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("duck");
        animals.add("sheep");
        //animals.add(Object object) <-- нельзя
        int index = randomNumber.nextInt(4);
        System.out.println(index);
        String animalStr = animals.get(index);
        System.out.println(animalStr);
    }
}


