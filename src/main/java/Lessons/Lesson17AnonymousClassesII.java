package Lessons;

public class Lesson17AnonymousClassesII {
    public static void main(String[] args) {
//        WeldingRobots weldingRobots = new WeldingRobots();
//        weldingRobots.canWeld();

        AbleToWeld ableToWeld = new AbleToWeld() { // <- создается анонимный класса
            @Override
            public void canWeld() {
                System.out.println("NewRobot can weld plate steel part");
            }
        };

        AbleToWeld ableToWeld1 = new AbleToWeld() {
            @Override
            public void canWeld() {
                System.out.println("NewRobot can weld plate steel part");
            }
        };
        ableToWeld1.canWeld();
    }
}

    interface AbleToWeld {
        abstract public void canWeld();
    }


    class WeldingRobots implements AbleToWeld {

        @Override
        public void canWeld() {
            System.out.println("WeldingRobot can weld steel part");
        }
    }



