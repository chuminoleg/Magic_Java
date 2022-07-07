package Students.LeonidLeo;
/**
 * Почувствуй себя деканом
 * У нас есть группа в университете и метод, который должен отчислять конкретного студента, но он почему-то не работает.
 * Твоя задача — найти ошибку и исправить, чтобы метод exclude смог отчислить студента.
 * Requirements:
 * 1. В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
 * 2. В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
 * 3. Метод exclude должен удалять из списка переданного студента.
 */
import java.util.ArrayList;
import java.util.List;

public class Task_11_UniversityGroup_Valentin_Silchuk {
    public List<String> students;
    public Task_11_UniversityGroup_Valentin_Silchuk() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }
    //Было
//    public void exclude(String excludedStudent) {
//        for (String student : students) {
//            if (student.equals(excludedStudent)) {
//                students.remove(student);
//            }
//        }
//    }
    //стало
    public void exclude(String excludedStudent) {
        students.remove(excludedStudent);
    }
    public static void main(String[] args) {
        Task_11_UniversityGroup_Valentin_Silchuk universityGroup = new Task_11_UniversityGroup_Valentin_Silchuk();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}