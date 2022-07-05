package Lessons.Lesson17.Materials;

interface AbleToWeld {
    public void weld();
}

public class AnonymousClassesII {
    public static void main(String[] args) {
//    Robots robots = new Robots();
//    robots.weld();

        AbleToWeld ableToWeld = new AbleToWeld() { // <- создается анонимный класс наследник implements AbleToWeld
            @Override
            public void weld() {

            }
        };

    }
}

class Robots implements AbleToWeld{

    @Override
    public void weld() {
        System.out.println("Robot is welding steel parts");
    }
}
