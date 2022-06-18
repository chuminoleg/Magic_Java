package Lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson7_Scanner_File {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // Windows -> "\", Mac -> "/"
        File file = new File("C:" + separator + "Users" + separator + "Oleg_Chumin" + separator + "IdeaProjects" +
                separator + "Magic_Java" + separator + "src" + separator + "main" + separator
                + "java" + separator + "Lessons" + separator + "toRead.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
