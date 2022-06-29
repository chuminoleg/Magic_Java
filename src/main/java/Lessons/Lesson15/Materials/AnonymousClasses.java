package Lessons.Lesson15.Materials;

public class AnonymousClasses {
    public static void main(String[] args) {
    Birds birds = new Birds();
    birds.fly();

    Duck duck = new Duck();
    duck.fly();

    Birds birds2 = new Birds() {
        void fly() {
            System.out.println("");
        };
    };

    }

}

class Birds {
    void fly() {
        System.out.println("Birds can fly");
    }
}

class Duck extends Birds {
    @Override
    void fly() {
        System.out.println("Duck can fly");
    }
}
