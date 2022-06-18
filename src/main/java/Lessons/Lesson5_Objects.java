package Lessons;

public class Lesson5_Objects {
    public static void main(String[] args) {
        Human human1 = new Human("Vasia", 40);
        System.out.println(human1.name + " " + human1.age);
//        Human human;
//        String str1 = new String("Ivan");
//        String str;

        Dog dog = new Dog();
        dog.name = "Bobik";
        dog.age = 3;
        dog.weight = 3.45f;
        System.out.println("Собака по кличке " + dog.name + " " + "возрастом " + dog.age + " вес " + dog.weight);
        dog.canSleep();
        dog.canRun();
    }
}

class Human {
    String name;
    int age;
//    Human human;

    public Human(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }
}

class Dog {
    String name;
    int age;
    float weight;

    void canRun() {
        System.out.println("Собака бежит");
    }

    void canSleep() {
        System.out.println("Собака спит");
    }
}
