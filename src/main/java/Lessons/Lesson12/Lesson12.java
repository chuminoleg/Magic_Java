package Lessons.Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/Lessons/Lesson12/Materials/testToWriteFile.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("Hallo world!");
        writer.println("Hello Java!");
        writer.println("end of testToWriteFile.txt");
        writer.close();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
