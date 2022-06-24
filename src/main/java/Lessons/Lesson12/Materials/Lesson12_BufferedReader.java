package Lessons.Lesson12.Materials;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson12_BufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/Lessons/Lesson12/Materials/testTextFile.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.println("Hello, world!");
        writer.println("Hello, Java!");
        writer.close();
    }
}
