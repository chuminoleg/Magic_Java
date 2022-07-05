package Lessons;

public class Tesla {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) { //
        this.id = id; // создают и возвращают копию поля
    }

    private class Motor { // внутренний нестатический класс.
        public void starMotor() {
            System.out.println("Motor is starting..." + id);
        }
    }

    public static class Battery { // внутренний статический класс
        public void chargeBattery() {
            System.out.println("Battery charging...");
        }
    }


    public Tesla(int id) {
        this.id = id;
    }

    public void startToMove() {
        int xKey = 12;

        class SwitchKey { // возможен ли вызов из внутреннего класса в методе, обращение к полям в общем классе
            public void powerOn() {
                System.out.println(xKey);
                System.out.println(id);
            }
        }
        SwitchKey switchKey = new SwitchKey();
        switchKey.powerOn();
        Motor motor = new Motor();
        motor.starMotor();
        System.out.println("Electric car is starting to move");
    }

}

class Test {

}
