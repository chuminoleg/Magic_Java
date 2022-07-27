package Lessons.Lesson24.Materials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // уникальные ключи, не могут повторятся
        Set<Integer> hashSet = new HashSet<>(); // нет двух одинаковых элементов

        hashMap.put(1, "Value");
        hashMap.put(1, "Another Value");

        hashSet.add(5); // автоупаковка в int из Integer
        hashSet.add(5);

        System.out.println("hashMap: " + hashMap);
        System.out.println("hashSet: " + hashSet);

        // что будет если класть Объект ?

        Person person1 = new Person(1, "Leon");
        Person person2 = new Person(2, "Arsenii");

        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        map.put(person1, "Value");
        map.put(person2, "Value");
        System.out.println();

        set.add(person1);
        set.add(person2);
        System.out.println("map: " + map);
        System.out.println("set: " + set);
        System.out.println();

        Person person3 = new Person(2, "Arsenii");
        map.put(person3, "Value");
        set.add(person3);
        System.out.println("map: " + map);
        System.out.println("set: " + set);
        System.out.println();

        //hashCode() equals()

        //String
//        Map<Person, String> strHashMap = new HashMap<>();
        Set<String> strHashSet = new HashSet<>();
        strHashSet.add("Hello");
        strHashSet.add("Hello");
        System.out.println("strHashSet: " + strHashSet);
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}