package Lessons.Lesson9Materials.Interfaces;

public class Animals implements Info{
    public int id;

    public Animals(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Can sleep");
    }

    @Override
    public void printInfo() {
        System.out.println("Animals have id: " + id);
    }
}
