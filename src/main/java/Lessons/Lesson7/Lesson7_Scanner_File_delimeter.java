package Lessons.Lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson7_Scanner_File_delimeter {
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Lessons\\toReadOneLine.txt");
        Scanner scanner = new Scanner(file);
        String str = scanner.nextLine();
        String[] words = str.split("0");
        System.out.println(Arrays.toString(words));
    }
}
