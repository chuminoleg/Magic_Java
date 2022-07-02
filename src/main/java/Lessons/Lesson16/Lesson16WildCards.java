package Lessons.Lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson16WildCards {
    public static void main(String[] args) {
        List<MotorVehicle> listOfMotorVehicle = new ArrayList<>();
        listOfMotorVehicle.add(new MotorVehicle(100));
        listOfMotorVehicle.add(new MotorVehicle(200));

        printArrayList(listOfMotorVehicle);

        List<Truck> listOfTrucks = new ArrayList<>();
        listOfTrucks.add(new Truck(300));
        listOfTrucks.add(new Truck(400));

        printArrayList(listOfTrucks);

        List<Truck> listOfCars = new ArrayList<>();
        listOfCars.add(new Truck(500));
        listOfCars.add(new Truck(600));

        Random random = new Random();
        int randomNumber = random.nextInt(100); //100

    }
    /**
     * Object
     * MotorVehicle <---
     * Truck
     * Car
     * */

    private static void printArrayList(List<? extends MotorVehicle> collection) {
//    private static void printArrayList(List<? super MotorVehicle> collection) {
        for (MotorVehicle element : collection) {
            System.out.println(element);
        }
    }
}

class MotorVehicle {
    int id;


    public MotorVehicle(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "id=" + id +
                '}';
    }
}

class Truck extends MotorVehicle{

    public Truck(int id) {
        super(id);
    }
}

class Car extends Truck{

    public Car(int id) {
        super(id);
    }
}



