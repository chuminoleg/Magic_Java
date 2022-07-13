package Lessons.Lesson13.Lesson18;

public class Lesson18TestIntLinkedList {
    public static void main(String[] args) {
        String str1 = null;
//        System.out.println("A".equalsIgnoreCase(str1)); // нет исключения
//        System.out.println(str1.equalsIgnoreCase("A")); //здесь NullPointerException

        IntegerLinkedList integerLinkedList = new IntegerLinkedList();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(5);
        System.out.println(integerLinkedList.size());
        System.out.println(integerLinkedList);
    }
}
