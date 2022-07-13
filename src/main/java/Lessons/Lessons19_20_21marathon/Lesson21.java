package Lessons.Lessons19_20_21marathon;

import java.util.HashMap;
import java.util.Map;

public class Lesson21 {
    public static void main(String[] args) {
        // 1 -> [.......]
        // 2 -> [.......]
        // 3 -> [.......]

        Map<Integer, String> map = new HashMap<>(); // <> если определены типы ключей и значений ставим знак <>
        map.put(100, "one hundred");
        map.put(200, "two hundreds");
        map.put(300, "three hundreds");
        map.put(400, "400");
        map.put(500, "500");
        map.put(600, "600");
        map.put(700, "700");
        System.out.println(map);

        map.put(200, "other two hundreds");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(100));
        System.out.println(map.get(200));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

    public static String getNewString(String str) {
        if ("asdfasfasdfas".equals(str)) {

        }
        return str;
    }
}
