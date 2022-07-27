package Lessons.Lesson16.Materials;

import java.util.*;

public class HashMapInside {
    public static void main(String[] args) {
        Map<Object, Object> hashMap0 = new HashMap<>();
        // уникальность ключа определяется контрактом hashCode и equals
        //HashTable depricated (синхронизированная и работает медленно)
        //HashTable замена ConcurrentHashMap (потокобезопасная коллекция)
        //WeakHashMap * четыре разных типа ссылок в Java сильные, слабые, мягкие и фантомные

        Map<Animal, String> enumMap = new EnumMap<>(Animal.class);
        enumMap.put(Animal.CAT, "Murzik");
        enumMap.put(Animal.DOG, "Uilliam");
        enumMap.put(Animal.BIRD, "Some bird");
        System.out.println(enumMap);

        Set set = enumMap.entrySet(); // метод возвращает Set представление сопоставлений, содержащихся в Map.

        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " -> " + m.getValue()); //null в значение можно, но нельзя в ключ
            //EnumMap не синхронизирована
            // для синхронизации надо
            Collections.synchronizedMap(enumMap);  // так синхронизируется enumMap.
        }

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Murzik");
        hashMap.put(2, "Lotar");
        hashMap.put(3, "Sherlock");
        hashMap.put(4, "Erna");
        hashMap.put(5, "Katana");
        hashMap.put(6, "Python");

        // Запись карты (пара ключ-значение). Метод Map.entrySet возвращает коллекцию-представление карты,
        // элементы которой относятся к этому классу. Единственный способ получить ссылку на запись карты — это итератор
        // этого представления-коллекции.
        for (Map.Entry<Integer, String> element : hashMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }

}

enum Animal {
    CAT, DOG, BIRD
}
