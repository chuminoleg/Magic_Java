package Lessons.Lesson15.Materials;

public class UpCastingAndDownCasting {
    public static void main(String[] args) {

        //UpCasting - восходящее преобразование (неявное), Dog ниже по иерархии, сужение методов
    Animal animal = new Dog();

        // DownCasting - нисходящее преобразование (явное), ниже по иерархии, расширение методов
        Dog dog = (Dog) animal;
        dog.bark();
    }
}

