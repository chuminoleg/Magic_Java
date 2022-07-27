package Classes;

/**
 Переобуваемся на лету
 Потренируйся определять и изменять значения переменных во время выполнения программы:
 Поставь break point напротив вызова метода println и запусти программу в режиме отладки.
 После остановки нажми F8 ровно 9 раз.
 Посмотри, какое значение сейчас у переменной correction и установи такое же значение переменной fahrenheit (в окне отладки).
 Нажми F8 еще 6 раз.
 Посмотри текущее значение переменной correction и присвой это значение полю result (измени исходный код).
 В итоге в классе Solution должно быть только одно изменение: поле result должно быть инициализировано при объявлении.
 Requirements:
 1. Метод main не изменяй.
 2. Полю result должно быть присвоено правильное значение.
 */

public class Task_008_14_07_22_Leonid_Leo {

    public static int result=-88;

    public static void main(String[] args) {

            byte correction = Byte.MAX_VALUE;
            for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += -47) {
                correction *= fahrenheit;
                System.out.println(correction);
            }
        }
    }



