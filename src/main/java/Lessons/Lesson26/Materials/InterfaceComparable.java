package Lessons.Lesson26.Materials;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class InterfaceComparable {
    private static final Random random = new Random();
    private static final int RANGE = 5;

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Set<Customer> customerSet = new TreeSet<>(); // сортирует
        addCustomer(customerList);
        System.out.println(customerList);
        System.out.println();
        addCustomer(customerSet);
        System.out.println(customerSet);
    }

    private static void addCustomer(Collection collection) {
        for (int i = 0; i < RANGE; i++) {
            collection.add(new Customer(random.nextInt(RANGE), "Name" + random.nextInt(RANGE*10)));
        }
    }
}

class Customer implements Comparable<Customer>{
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer client = (Customer) o;

        if (id != client.id) return false;
        return name.equals(client.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "id " + id +
                ", " + name  +
                '}';
    }

    @Override
    public int compareTo(@NotNull Customer o) {
        if(this.id > o.getId()) {
            return 1;
        } else if(this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}



