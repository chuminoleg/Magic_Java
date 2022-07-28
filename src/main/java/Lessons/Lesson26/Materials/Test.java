package Lessons.Lesson26.Materials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(4, "Name1"));
        clients.add(new Client(7, "Name2"));
        clients.add(new Client(2, "Name3"));
        clients.add(new Client(1, "Name4"));

        System.out.println(clients);

        Collections.sort(clients, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                if(o1.getId() > o2.getId()) {
                    return 1;
                } else if(o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(clients);

    }
}



class Client {
    private int id;
    private String name;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
