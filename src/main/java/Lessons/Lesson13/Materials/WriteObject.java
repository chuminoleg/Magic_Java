package Lessons.Lesson13.Materials;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person client1 = new Person(1, "John");
        Person client2 = new Person(2, "Bob");

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Oleg_Chumin\\IdeaProjects" +
                "\\Magic_Java\\src\\main\\java\\Lessons\\Lesson13\\Materials\\people.bin"); // запись бинарного файла
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(client1);
        oos.writeObject(client2);
        oos.close();
    }
}
