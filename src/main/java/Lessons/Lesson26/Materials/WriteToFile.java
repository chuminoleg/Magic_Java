package Lessons.Lesson26.Materials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToFile = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Lessons\\Lesson26" +
                "\\Materials\\writeToFile.txt";
        File file = new File(pathToFile);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Эта 1-я строка передана в файл в качестве теста");
        printWriter.println("Эта 2-я строка передана в файл в качестве теста");
        printWriter.println("Эта 3-я строка передана в файл в качестве теста");
        printWriter.println("Эта 4-я строка передана в файл в качестве теста");
        printWriter.close();
    }
}
