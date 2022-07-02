package Lessons.Lesson16.Materials.WildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<MotorVehicle> listOfCars = new ArrayList<>();
        listOfCars.add(new MotorVehicle(100));
        listOfCars.add(new MotorVehicle(200));

        printMotorVehicleObjects(listOfCars);

        List<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(new Truck(300));
        listOfTrucks.add(new Truck(400));

//        printMotorVehicleObjects(listOfTrucks); //<--
        printMotorVehicleObjects(listOfTrucks);
    }

//    private static void printMotorVehicleObjects(List<MotorVehicle> object) {
        private static void printMotorVehicleObjects(List<? extends MotorVehicle> object) { //super
        for (MotorVehicle element : object) {
            System.out.println(element);
        }
    }
}

class MotorVehicle {
    int id;

//    public MotorVehicle() {
//    }

    public MotorVehicle(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        //return String.valueOf(id) <-- так тоже можно
        return "MotorVehicle{" +
                "id=" + id +
                '}';
    }
}

class Car extends MotorVehicle{

    public Car(int id) {
        super(id);
    }
}

class Truck extends MotorVehicle {

    public Truck(int id) {
        super(id);
    }
}
