package Lessons.Lesson9.Materials.InheritanceSample;

public class Lesson9Inheritance {
    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.eat();
        animal.sleep();
        System.out.println();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
