package Lessons.Lesson9Materials.Interfaces;

public class Person implements Info{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Can say Hallo");
    }

    @Override
    public void printInfo() {
        System.out.println("Person has name: " + name);
    }
}
