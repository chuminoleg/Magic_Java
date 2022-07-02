package Students.ValentinSilchuk;
/**Задача 8 на методы: Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
        Для этого создай внутренний статический (вложенный) класс Calculator и перенеси в него методы add, subtract, multiply и divide.
        Не забудь подкорректировать их вызовы.
        Requirements:
        1. В классе Solution нужно создать вложенный (static nested) класс Calculator.
        2. Методы add, subtract, multiply и divide нужно перенести в класс Calculator.
        3. В методе main должны быть вызваны методы add, subtract, multiply и divide класса Calculator.*/
public class Task_8_Solution_Valentin_Silchuk {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }
    public static class Calculator{
        public static void add ( int a, int b){
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }
        public static void subtract ( int a, int b){
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }
        public static void multiply ( int a, int b){
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }
        public static void divide ( int a, int b){
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
