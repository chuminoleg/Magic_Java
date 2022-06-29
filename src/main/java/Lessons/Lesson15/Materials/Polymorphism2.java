package Lessons.Lesson15.Materials;

public class Polymorphism2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        testMethod(animal);
        testMethod(dog);
        testMethod(cat);
    }

    public static void testMethod(Animal animal) {
        animal.eat();
    }
}
// если бы не было полиморфизма пришлось бы делать отдельный метод на каждый тип объекта

