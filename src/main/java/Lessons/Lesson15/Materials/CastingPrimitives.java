package Lessons.Lesson15.Materials;

public class CastingPrimitives {
    public static void main(String[] args) {
        byte byteNumber = 123; // -128 ... 127
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE );
//        short
//        int
        long longNumber = 123; // -9_223_372_036_854_775_808 ...-9_223_372_036_854_775_808
        System.out.println(Long.MIN_VALUE + " " + Long.MIN_VALUE);

        float floatNumber = 123.7f;
        float floatNumber3 = (float) 123.7;
        long longNumber2 = 3148957894758795837L;

        int intNumber2 = (int) 13423232342344L; //явное приведение типов
        long longNumber3 = intNumber2; //неявное приведение типов

        System.out.println();
    }
}
