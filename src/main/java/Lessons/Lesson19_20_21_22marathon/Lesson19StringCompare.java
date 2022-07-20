package Lessons.Lesson19_20_21_22marathon;

public class Lesson19StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "HELLO";

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //true
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println();
        String string4 = "Hello";
        String string5 = "Hello12345".substring(0, 5);
        System.out.println(string4 == string5); //false
        System.out.println(string4.equals(string5)); //
        //Object -> String (@Override equals)
    }
}
