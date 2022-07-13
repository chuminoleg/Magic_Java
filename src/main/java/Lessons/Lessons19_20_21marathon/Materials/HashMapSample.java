package Lessons.Lessons19_20_21marathon.Materials;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        // отображение 1 -> []  2 -> [] ...
        Map<Integer, String> map = new HashMap<>(); //<> важно используется когда тне важен порядок LinkedHashMAp
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map);

        map.put(3, "other value");
        System.out.println(map); //не может быть дубликатов ключей!

        System.out.println(map.get(1));
        System.out.println(map.get(10)); //null

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
