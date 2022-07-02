package Lessons.Lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) throws FileNotFoundException {
        List arrayListOfAnimals = new ArrayList(); // 10 ячеек, size(0)
//        System.out.println(arrayListOfAnimals.size());
        //[][][][][][][][][][][][] <- ArrayList<-[][][][][][][][][][][][]
        File file = new File("path to file");
        arrayListOfAnimals.add("cat");
        arrayListOfAnimals.add("dog");
        arrayListOfAnimals.set(0, "frog");
//        arrayListOfAnimals.set(5, "frog2");
        arrayListOfAnimals.add("sheep");
        arrayListOfAnimals.add("bird");
        arrayListOfAnimals.add(new Object());
        arrayListOfAnimals.add(23423);
        arrayListOfAnimals.add(new StringBuilder("Hallo Java"));

//        String str = (String) arrayListOfAnimals.get(6); <--
        int number = (int) arrayListOfAnimals.get(5);

//        System.out.println(arrayListOfAnimals.get(0) + " " + arrayListOfAnimals.get(1));
        System.out.println(arrayListOfAnimals.size());

//        System.out.println(arrayListOfAnimals.get());

        List<String>arrayListOfAnimals2 = new ArrayList<>();
        arrayListOfAnimals2.add("frog");
        arrayListOfAnimals2.add("elephant");
        arrayListOfAnimals2.add(String.valueOf(234423));
        arrayListOfAnimals2.add(String.valueOf(new StringBuilder("Hallo Java")));
        arrayListOfAnimals2.add(new StringBuilder("Kotlin").toString());
        arrayListOfAnimals2.add((new StringBuffer("Hi").toString()));

        int[] array = new int[11];
        //[3][0][0]][6][0][0][0][8][0][0][0] <- array
    }
}


