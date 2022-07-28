package Lessons.Lesson26;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class TestInterfaceComparable {
    private static final Random random = new Random();
    private static final int RANGE = 20;

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Set<Customer> customerSet = new TreeSet<>();
        addCustomerData(customerList);
        System.out.println(customerList);
        addCustomerData(customerSet);
        System.out.println(customerSet);

    }

    private static void addCustomerData(Collection collection) {
        for (int i = 0; i < RANGE / 5; i++) {
            collection.add(new Customer(random.nextInt(RANGE), "Name" + random.nextInt(RANGE)));
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

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
