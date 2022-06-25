package Lessons.Lesson8;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Lesson8_PrintF {
    public static void main(String[] args) {
        int number = 23452454;
        float floatNumber = 45.67f;

//        System.out.println("Строка ");
//
        System.out.printf("Вывод значений чисел: %d, %f \n",  floatNumber, number); // \n == %n
//
//        System.out.format("");

        long longNumber = 34345354;
        System.out.printf("%010d%n", longNumber);
    }
}
