package Lessons.Lesson13.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main" +
                "\\java\\Lessons\\Lesson13\\Serialization\\persons.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person1 = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();
        Person person3 = (Person) ois.readObject();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
