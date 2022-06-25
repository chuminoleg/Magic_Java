package Lessons.Lesson7;

public class Lesson7_Main {
    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.getAnimalClassName();

    }
}

class AnimalsNew {
    private String animalClassName;
    private int age;

    public String getAnimalClassName() {
        return animalClassName;
    }

//    public void setAnimalClassName(String animalClassName) {
//        this.animalClassName = animalClassName;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void go() {
        System.out.println("Can go");
    }
    void cry() {
        System.out.println("Can cry");
    }
}

class Birds extends AnimalsNew{
    void canFly() {
        System.out.println("Can fly");
    }
}


