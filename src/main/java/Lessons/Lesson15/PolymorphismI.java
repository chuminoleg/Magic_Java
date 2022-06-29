package Lessons.Lesson15;

public class PolymorphismI {
    public static void main(String[] args) {
        Birds2 birds2 = new Birds2();
        birds2.canWalk();

        Duck duck = new Duck();
        duck.canWalk();
        duck.canFly();
        duck.canSwim();

        Birds2 birds21 = new Duck();
        birds21.canWalk();
        /*
        Object
        Birds2
        Duck
        */

        double number = 234234.0F;
        int number2 = (int) 234234.0F;
    }
}

class Birds2 extends Object{
    void canWalk() {
        System.out.println("Birds can walk");
    }
}

class Duck extends Birds2 {
    void canFly() {
        System.out.println("Duck can fly");
    }

    void canSwim() {
        System.out.println("Duck can swim");
    }
}

