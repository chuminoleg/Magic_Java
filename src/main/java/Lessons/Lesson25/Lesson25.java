package Lessons.Lesson25;

import sun.util.resources.cldr.ca.CurrencyNames_ca;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Lesson25 {
    public static void main(String[] args) {
        Map<Object, Object> hashMapObject = new HashMap<>();
        //HashTable @Depricated (синхронизирована и медленно работала) -> ConcurrentHashMap (потокобезопасная)
        //WeakHashMap -> слабые ссылки по ключам, в Java -> сильные, слабые(те которые могут быть сразу удалены сборщиком
        // мусора GC - garbage collector, мягкие и фантомные.

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Cat1");
        hashMap.put(2, "Dog1");
        hashMap.put(3, "Bird1");
        hashMap.put(5, "Dog2");
        hashMap.put(6, "Cat3");

//        Set set = hashMap.entrySet();

        for (Map.Entry<Integer, String>  element: hashMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }

        Map<Animal, String> enumMap = new EnumMap<>(Animal.class);
        enumMap.put(Animal.BIRD, "Duck");
        enumMap.put(Animal.DOG, "Dog");
        enumMap.put(Animal.CAT, "Cat");
        System.out.println(enumMap);

    }
}

enum Animal {
    CAT, DOG, BIRD
}
