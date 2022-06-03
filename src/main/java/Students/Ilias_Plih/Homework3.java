package Students.Ilias_Plih;

public class Homework3 {
    public static void main(String[] args) {

        byte a = 4;
        short b = 34;
        int c = 700_000_000;
        long d = -65466;
        float e = 8.477f;
        double y = 67.555;

        Byte A = a;
        Short B = b;
        Long D = d;
        Integer C = c;
        Float E = e;
        Double Y = y;

        Byte minByte = Byte.MIN_VALUE;
        Byte maxByte = Byte.MAX_VALUE;
        System.out.println(minByte + " " + maxByte);

        Short minShort = Short.MIN_VALUE;
        Short maxShort = Short.MAX_VALUE;
        System.out.println(minShort + " " + maxShort);

        Long minLong = Long.MIN_VALUE;
        Long maxLong = Long.MAX_VALUE;
        System.out.println(minLong + " " + maxLong);

        Integer minInteger = Integer.MIN_VALUE;
        Integer maxInteger = Integer.MAX_VALUE;
        System.out.println(minInteger + " " + maxInteger);

        Float minFloat = Float.MIN_VALUE;
        Float maxFloat = Float.MAX_VALUE;
        System.out.println(minFloat + " " + maxFloat);

        Double minDouble = Double.MIN_VALUE;
        Double maxDouble = Double.MAX_VALUE;
        System.out.println(minDouble + " " + maxDouble);
    }
}
