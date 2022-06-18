package Lessons;

import java.util.Arrays;

public class Lesson6_StringMethods {
    public static void main(String[] args) {
        String str = "Random class and Math class";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        System.out.println(str);
        System.out.println();
        System.out.println(str.toUpperCase());
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(str.charAt(9));
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        boolean check = str.isEmpty();

        stringBuilder.append(" and StringBuilder class");
        System.out.println(stringBuilder);
        String str1 = "draesrvbserb";
        String str2 = "arsafragr";
        System.out.println(str1 + str2);
        StringBuffer stringBuffer = new StringBuffer();
    }
}
