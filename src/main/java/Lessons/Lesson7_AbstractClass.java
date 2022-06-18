package Lessons;

public class Lesson7_AbstractClass {
    public static void main(String[] args) {

    }
}

abstract class Car {
    abstract void canDrive(); // абстрактный метод не имееет тела метода {}

    abstract void canBreak();

    abstract void canTurn();

    void print() {

    }

}

class Truck extends Car {

    @Override
    void canDrive() {
        System.out.println("Грузовиком может управлять профессионал");
    }

    @Override
    void canBreak() {
        System.out.println("Может тормозить, тормоза барабанного типа");
    }

    @Override
    void canTurn() {
        System.out.println("Может поворачивать, радиус поворота очень большой");
    }
}

class Trolley extends Car{

    @Override
    void canDrive() {

    }

    @Override
    void canBreak() {

    }

    @Override
    void canTurn() {

    }
}
