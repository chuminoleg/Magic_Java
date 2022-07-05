package Students.ValentinSilchuk;
/**
 * Задача 10. Кон, котэ и нация
 * "Кон", "котэ" и "нация". Как соединить эти три строки? Ты же помнишь, как соединять String'и в Java?
 * Исправь ошибки в коде, чтобы программа компилировалась и работала.
 * Requirements:
 * 1. В методе main класса Solution нужно исправить ошибки: при выводе на экран должна использоваться конкатенация строк.
 */
public class Task_10_Concatenation_Valentin_Silchuk {
    public static void main(String[] args) {
        String name = "Diego";
        int age = 35;
        //конкатенация
        System.out.println("Name : "+ name + " Age : " + age); // было System.out.println("Name : "name" Age : "age);
        // форматированный вывод
        System.out.printf("Name : %s Age : %o",name, age);
    }
}


