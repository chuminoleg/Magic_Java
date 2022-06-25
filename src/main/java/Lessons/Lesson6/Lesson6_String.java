package Lessons.Lesson6;

import java.util.Objects;

public class Lesson6_String {
    public static void main(String[] args) {
        String string = new String();
        string = "Привет Java";
        String string2 = "Привет Java";

        // == != > < >= <= && ||
        boolean result = string == string2;
        System.out.println(result);
        result = string.equals(string2);
        System.out.println(result);

        Cats cat1 = new Cats("Vasia", 2, "black");
        Cats cat2 = new Cats("Vasia", 2, "black");
        System.out.println(cat1.equals(cat2));
    }
}

class Cats {
    String name;
    int age;
    String color;

    public Cats(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        Cats cats = (Cats) o;
        return age == cats.age && Objects.equals(name, cats.name) && Objects.equals(color, cats.color);
    }
}
