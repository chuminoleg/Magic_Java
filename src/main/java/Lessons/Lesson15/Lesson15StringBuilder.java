package Lessons.Lesson15;

public class Lesson15StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lesson15");
        sb.append(" Hellow");
        sb.append(" Java!");
        System.out.println(sb.toString());
        System.out.println();
        sb.insert(9, "Python ").insert(16, "C# ").append(" Java!");
        System.out.println(sb.toString());
        System.out.println();
        sb.replace(15, 19, " No-No ");
        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.reverse();
        System.out.println(sb.toString());
        String str = sb.toString();
        System.out.println(str);

    }
}
