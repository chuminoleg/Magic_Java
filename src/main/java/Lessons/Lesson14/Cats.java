package Lessons.Lesson14;

import java.io.Serializable;

public class Cats implements Serializable {
    private String name;
    private int age;
    private String color;
    private boolean isClient;
    private transient int internalId;

    public Cats(String name, int age, String color, boolean isClient, int internalId) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isClient = isClient;
        this.internalId = internalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClient() {
        return isClient;
    }

    public void setClient(boolean client) {
        isClient = client;
    }

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isClient=" + isClient +
                ", internalId=" + internalId +
                '}';
    }
}
