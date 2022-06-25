package Lessons.Lesson5;

public class Lesson5_GetterSetter {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 3, "white&black");
        System.out.println(cat1);
    }
}

class Cat {
    String name;
    int age;
    String color;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
