package Lessons.Lesson9Materials.InheritanceSample;

public class Dog extends Animals{

    public void bark() {
        System.out.println("Dog can bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating...");
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("Dog sleeping..");
    }
}
