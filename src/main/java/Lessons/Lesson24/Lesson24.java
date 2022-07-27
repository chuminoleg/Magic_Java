package Lessons.Lesson24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson24 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // уникальные ключи, ключи повторятся не могут
        Set<Integer> hashSet = new HashSet<>(); // уникальные значения

        hashMap.put(1, "Value");
        hashMap.put(1, "Another Value");

        hashSet.add(5);
        hashSet.add(5);

//        System.out.println("hashMap: " + hashMap);
//        System.out.println("hashSet: " + hashSet);

        Pet pet1 = new Pet(100500, "Pet1");
        Pet pet2 = new Pet(100500, "Pet2");

        Map<Pet, String> hashMapPet = new HashMap<>();
        Set<Pet> hashSetPet = new HashSet<>();

        hashMapPet.put(pet1, "Value");
        hashMapPet.put(pet2, "Value");
        hashSetPet.add(pet1);
        hashSetPet.add(pet2);

//        String str3 = "Hello";
//        String str4 = "Hello";
//        System.out.println(str3 == str4);



//        Set<String> hashSetStr = new HashSet<>();
//        String str1 = new String("Hello");
//        String str2 = new String("Hello");
//        hashSetStr.add(str1);
//        hashSetStr.add(str2);
//        System.out.println(hashSetStr);
        System.out.println(pet1.equals(pet2));
        System.out.println(pet1.hashCode());
        System.out.println(pet2.hashCode());
        System.out.println("hashMapPet: " + hashMapPet);
        System.out.println("hashSetPet: " + hashSetPet);
    }
}

class Pet {
    int id;
    String name;

    public Pet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //Object

    {
        Object object = new Object();
//        object.equals();
//        object.hashCode();
    }


//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//
//        Pet pet = (Pet) object;
//        if(id != pet.id) return false;
//        return name.equals(pet.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (id != pet.id) return false;
        return name.equals(pet.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    // contract hashCode() equals()
    // 1. Если у двух объектов не равны результаты функции hashCode, то объекты разные
    // 2. Если совпадают hashCode, то -> либо объекты равны -> либо коллизия,
    // 3. поэтому вызывается функция equals
}


