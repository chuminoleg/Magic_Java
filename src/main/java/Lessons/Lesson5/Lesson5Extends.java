package Lessons.Lesson5;

public class Lesson5Extends {
    public static void main(String[] args) {
        HumanNew man = new HumanNew();
        man.canSay();
        man.canWork();
        man.go();

        Duck duck = new Duck();
        duck.canFly();
        duck.go();

    }
}

class Animal {
    void go() {
        System.out.println("Can go");
    }
}

class HumanNew extends Animal{
    void canSay() {
        System.out.println("Hallo");
    }

    void canWork() {
        System.out.println("Work");
    }
}

class Duck extends Animal {
    void canFly() {
        System.out.println("Can fly");
    }
}
