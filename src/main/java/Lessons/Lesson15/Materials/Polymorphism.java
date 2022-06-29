package Lessons.Lesson15.Materials;

//рекомендуется повторить наследование и интерфейсы
//сgочобность метода обрабатывать данные разных типов
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        System.out.println();

        Animal animal2 = new Dog();
        animal2.eat();
        System.out.println();
//        animal2.bark();
        Dog dog2 = new Dog();
        dog.eat();
        dog.bark();

        // позднее связывание реализация метода если он переопределен в потомке

    }

}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is bark!");
    }
    @Override
    void eat() {
        System.out.println("Dog is eating!");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("Cat is eating!");
    }
}

