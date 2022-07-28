package Lessons.Lesson26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectComparator {
    public static void main(String[] args) {
        List<Client> clientList = new ArrayList<>();
        clientList.add(new Client(4, "Name5"));
        clientList.add(new Client(1, "Name6"));
        clientList.add(new Client(45, "Name8"));
        clientList.add(new Client(23, "Name2"));
        clientList.add(new Client(7, "Name11"));
        clientList.add(new Client(3, "Name9"));

        System.out.println(clientList);
//        Collections.sort(clientList, new Comparator<Client>() {
//            @Override
//            public int compare(Client o1, Client o2) {
//                if(o1.getId() > o2.getId()) {
//                return 1;
//            } else if(o1.getId() < o2.getId()) {
//                return -1;
//            } else {
//                return 0;
//            }
//            }
//        });
        Collections.sort(clientList, (o1, o2) -> {
            if(o1.getId() > o2.getId()) {
                return 1;
            } else if(o1.getId() < o2.getId()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println(clientList);
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


