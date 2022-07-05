package Lessons;

public class Lesson17AnonymousClasses {
    public static void main(String[] args) {
        Robot robot = new Robot(10);
        robot.canWeld();

        NewRobot newRobot = new NewRobot(20);
        newRobot.canWeld();
    }
}

class Robot {
    private int id;

    public Robot(int id) {
        this.id = id;
    }

    public void canWeld() {
        System.out.println("Robot is welding steel parts");
    }
}

class NewRobot extends Robot {

    public NewRobot(int id) {
        super(id);
    }

    @Override
    public void canWeld() {
        System.out.println("NewRobot can weld plate steel part");
        super.canWeld();
    }
}
