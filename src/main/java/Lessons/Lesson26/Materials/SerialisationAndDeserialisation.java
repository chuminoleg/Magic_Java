package Lessons.Lesson26.Materials;

import java.io.*;

public class SerialisationAndDeserialisation {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(1, "Name1", 80);
        Person person2 = new Person(2, "Name2", 89);
        Person person3 = new Person(3, "Name3", 90);
        Person person4 = new Person(4, "Name4", 111);


        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java" +
                "\\src\\main\\java\\Lessons\\Lesson26\\Materials\\person.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);   // работает с объектом
                                                                                            // FileOutputStream

        WriteObject writeObject = new WriteObject();
        writeObject.writeToFile(objectOutputStream, person1);
        writeObject.writeToFile(objectOutputStream, person2);
        writeObject.writeToFile(objectOutputStream, person3);
        writeObject.writeToFile(objectOutputStream, person4);
    }
}

class Person implements Serializable {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class WriteObject {
    public void writeToFile(ObjectOutputStream objectOutputStream, Object object) throws IOException {
        objectOutputStream.writeObject(object);
    }
}

class ReadObject {

}
