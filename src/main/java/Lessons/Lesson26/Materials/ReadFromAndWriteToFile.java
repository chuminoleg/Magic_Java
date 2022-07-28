package Lessons.Lesson26.Materials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFromAndWriteToFile {
    private static final String PATH_TO_FILE = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java" +
            "\\Lessons\\Lesson26\\Materials\\WriteAndReadFile.txt";
    private static final File file = new File(PATH_TO_FILE);

    public static void main(String[] args) throws FileNotFoundException {
        WriteToFile(file);
        ReadFromFile(file);
    }

    public static void WriteToFile(File file) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Эта 1-я строка передана в файл в качестве теста");
        printWriter.println("Эта 2-я строка передана в файл в качестве теста");
        printWriter.println("Эта 3-я строка передана в файл в качестве теста");
        printWriter.println("Эта 4-я строка передана в файл в качестве теста");
        printWriter.close();
    }

    public static void ReadFromFile(File file) throws FileNotFoundException {
        final Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
