package Lessons.Lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson10TryCatch {
    public static void main(String[] args) {
        System.out.println("Программа работает в потоке main до создания объекта");
        readFile();
//        Thread.sleep(10);
        System.out.println("Программа работает после создания объекта fileNew");
    }

    static void readFile() {
        File fileNew = new File("C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Lessons" +
                "\\Lessons10_11\\Materials\\file.txt");
        try {
            Scanner scanner = new Scanner(fileNew);
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка в имени файла");
        }
    }
}
