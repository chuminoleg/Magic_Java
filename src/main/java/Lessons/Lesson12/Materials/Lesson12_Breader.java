package Lessons.Lesson12.Materials;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson12_Breader {
    public static void main(String[] args) throws IOException {
//        File file = new File("src/main/java/Lessons/Lesson12/Materials/testTextFile.txt");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get("src/main/java/Lessons/Lesson12/Materials/testToWriteFile.txt"))));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));


        while(reader1.readLine() != null) {
            System.out.println(reader1.readLine());
        }
        reader1.close();

        String str = reader2.readLine();
        System.out.println(str);

        int i = Integer.parseInt(reader2.readLine());
        Double d = Double.parseDouble(reader2.readLine());
        System.out.println(i);
        System.out.println(d);
        reader2.close();
    }
}
