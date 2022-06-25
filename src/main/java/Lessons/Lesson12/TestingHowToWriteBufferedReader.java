package Lessons.Lesson12;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestingHowToWriteBufferedReader {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Lessons\\Lesson12" +
                "\\testToWriteFile.txt";
        readUsingBufferedReader(filePath, StandardCharsets.UTF_8);
        System.out.println();
        readUsingInputStreamReader(filePath);
    }

    public static void readUsingBufferedReader(String filePath, Charset charset) throws IOException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String stringLine;
        while ((stringLine = bufferedReader.readLine()) != null) {
            System.out.println(stringLine);
        }
        bufferedReader.close();
        fileReader.close();
    }

    public static void readUsingInputStreamReader(String filePath) throws IOException {
        File file = new File(filePath);
        Reader reader = new InputStreamReader(new FileInputStream(file));
        BufferedReader bufferedReader = new BufferedReader(reader);
        String stringLine;
        while ((stringLine = bufferedReader.readLine()) != null) {
            System.out.println(stringLine);
        }
    }
}
