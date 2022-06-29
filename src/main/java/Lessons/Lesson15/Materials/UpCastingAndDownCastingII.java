package Lessons.Lesson15.Materials;

public class UpCastingAndDownCastingII {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = (Dog) animal;
        dog.bark(); // ошибка преобразования, восходящее преобразование всегда безопасно, нисходящее - небезопасно
    }
}
