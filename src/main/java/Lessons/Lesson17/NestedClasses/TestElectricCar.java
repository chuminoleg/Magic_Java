package Lessons.Lesson17.NestedClasses;

public class TestElectricCar {
    public static void main(String[] args) {
        Tesla tesla1 = new Tesla(1000);
        tesla1.start();

        Tesla.Battery battery = new Tesla.Battery(); // объект из статического класса почти ничего общего с Tesla
    }
}

// классы можно создавать в одном файле с public классом (public в этом случае может быть только один класс)
class Brakes {

}
