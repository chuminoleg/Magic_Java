package Students.ValentinSilchuk;
/**Выполнение фрагмента кода
 Потренируйся выполнять фрагмент кода во время работы программы:

 Поставь break point напротив вызова метода println и запусти программу в режиме отладки.
 После остановки нажми Alt+F8 (Option+F8 для macOS) и выполни следующий код:
 loop.replaceAll("\\W", "").split("fahrenheit")[1]
 Результат выполнения кода присвой полю result (измени исходный код).
 В итоге в классе Solution должно быть только одно изменение: поле result должно быть инициализировано при объявлении.


 Requirements:
 1. Метод main не изменяй.
 2. Полю result должно быть присвоено правильное значение.*/
public class Task8__Break_point_Valentin_Silchuk {


    public static int result=45967;

    public static void main(String[] args) {
        String loop = "    for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {\n";
        System.out.println(loop);
    }
}
