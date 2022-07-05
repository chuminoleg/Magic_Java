package Lessons;

public class Lesson17_Tesla {
    public static void main(String[] args) {
        Tesla tesla = new Tesla(1000);
        tesla.startToMove();
//        methodToTest();
//        Testing.methodToTestII(); // статический метод, вызывается через имя класса, статический метод принадлежит
        // классу и всем создаваемым из него объектам
//        Testing testing = new Testing();
//        testing.toPrint(); // <- нестатический метод вызывается только на объекте

//        Tesla.Battery battery = new Tesla.Battery();
//        battery.chargeBattery();
    }

    static void methodToTest() {

    }
}

class Testing {
    static void methodToTestII() {

    }

    void toPrint() {

    }
}


