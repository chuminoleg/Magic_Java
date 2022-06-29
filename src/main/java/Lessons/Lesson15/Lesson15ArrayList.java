package Lessons.Lesson15;

import java.util.ArrayList;
import java.util.List;

public class Lesson15ArrayList {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("cat");
        arrayList.add("frog");
        arrayList.add("fish");
        arrayList.add("sheep");
        arrayList.add(new Birds2());

        String str = (String) arrayList.get(0);
        System.out.println(str);

//        for (List l : arrayList) {
//
//        }

        List<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("cat");
        arrayList1.add("frog");
        arrayList1.add("fish");
        arrayList1.add("sheep");
//        arrayList1.add(new Object());

//        for (String l : arrayList1) {
//            System.out.println(arrayList1.get(l);
//        }

    }

}
