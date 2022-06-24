package Lessons.Lesson12.Materials;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src/main/java" +
                "/Lessons/Lesson12/Materials/testTextFile.txt"))));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        while(reader1.readLine() != null)   {
            System.out.println(reader1.readLine());
        }
        reader1.close();

        String str = reader2.readLine();
        System.out.println(str);
        int i = Integer.parseInt(reader2.readLine());
        System.out.println(i);
        reader2.close();


    }
}
