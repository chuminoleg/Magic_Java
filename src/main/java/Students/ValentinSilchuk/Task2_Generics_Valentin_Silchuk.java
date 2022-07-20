package Students.ValentinSilchuk;
/**
 * В классе Faculty есть метод printStudentNames(ArrayList), который принимает список объектов и выводит их имена.
 * Но на данный момент программа не компилируется.
 * Твоя задача исправить этот баг. Для этого нужно исправить сигнатуру метода printStudentNames(ArrayList),
 * чтобы он принимал список объектов только типа Student(используй дженерик).
 * Метод main не участвует в проверке.
 *
 * Requirements:
 * 1. Исправь сигнатуру метода printStudentNames, чтобы он принимал список только студентов.
 * 2. Реализацию метода printStudentNames не изменять.
 */

import java.util.ArrayList;

public class Task2_Generics_Valentin_Silchuk {
    /*
    Дженерики и студенты
    */
    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<Student1>();//ArrayList<Student>
        students.add(new Student1("Акакий"));
        students.add(new Student1("Любослав"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student1> students) { //<Student>
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}

 class Student1 {
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
