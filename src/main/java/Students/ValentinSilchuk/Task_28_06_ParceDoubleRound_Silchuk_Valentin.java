package Students.ValentinSilchuk;

/**
 * В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
 * Затем округли полученное значение, используя статический метод round класса Math.
 * Результат выведи на экран.
 * <p>
 * Requirements:
 * 1. В методе main должен вызываться метод parseDouble класса Double.
 * 2. В методе main должен вызываться метод round класса Math.
 * 3. В консоли должно выводиться число 13.
 */
public class Task_28_06_ParceDoubleRound_Silchuk_Valentin {
    public static void main(String[] args) {
        String string = "12.84";
        double doubleNumber = Double.parseDouble(string);
        System.out.println(Math.round(doubleNumber));
    }
}
