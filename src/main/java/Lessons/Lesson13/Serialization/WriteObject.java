package Lessons.Lesson13.Serialization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person client1 = new Person(1, "John");
        Person client2 = new Person(2, "Bob");
        Person client3 = new Person(3, "Jack");

        FileOutputStream fis = new FileOutputStream("C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main" +
                "\\java\\Lessons\\Lesson13\\Serialization\\persons.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        oos.writeObject(client1);
        oos.writeObject(client2);
        oos.writeObject(client3);
        oos.close();
        fis.close();
    }
}
