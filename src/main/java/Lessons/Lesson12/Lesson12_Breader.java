package Lessons.Lesson12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson12_Breader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/Lessons/Lesson12/testToWriteFile.txt");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while(reader1.readLine() != null) {
            System.out.println(reader1.readLine());
        }
        reader1.close();


        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String str = reader2.readLine();
        System.out.println(str);

        int i = Integer.parseInt(reader2.readLine());
        Double d = Double.parseDouble(reader2.readLine());
        System.out.println(i);
        System.out.println(d);
        reader2.close();
    }
}
