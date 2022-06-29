package Lessons.Lesson15.Materials;

public class StringBuilderChaining {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lesson15");
//        sb.append(Lesson15.class.getName());
        sb.append(" Hellow");
        sb.append(" Java!");
//        sb.append(Lesson15.class.getName());
        System.out.println(sb.toString());
        System.out.println();
                sb.insert(9, "Hellow ").insert(15," Magic ").insert(22,"Java").insert(26," group!");;
        System.out.println(sb.toString());
        sb.deleteCharAt(14);
        System.out.println(sb.toString());
        System.out.println(sb.lastIndexOf("Hellow"));
        sb.replace(15, 20,"No-No");
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.substring(20, 40));
        System.out.println(sb.reverse().toString());
        System.out.println(sb.toString());
    }
}
