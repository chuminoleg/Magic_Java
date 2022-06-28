package Lessons.Lesson14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteCatsObjectsToFile {
    public static void main(String[] args) throws IOException {
        //String name, int age, String color, boolean isClient, int internalId
        Cats cat1 = new Cats("Vasia", 2, "black", false, 00001);
        Cats cat2 = new Cats("Barsik", 3, "white", false, 00002);
        Cats cat3 = new Cats("Snezok", 7, "brawn", false, 00012);
        Cats cat4 = new Cats("Beljash", 1, "colorPoint", true, 00231);
        Cats cat5 = new Cats("Guljash", 5, "tabby", true, 00341);
        Cats cat6 = new Cats("Baton", 7, "ginger", false, 00235);
        Cats cat7 = new Cats("Shashljik", 9, "grey", false, 00234);

        Cats[] arrayOfCats = {cat1, cat2, cat3, cat4, cat5, cat6, cat7};

        String pathToFile = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java" +
                "\\Lessons\\Lesson14\\cats.bin";
        FileOutputStream fos = new FileOutputStream(pathToFile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(arrayOfCats.length);
//        for (Cats cats : arrayOfCats) {
//            oos.writeObject(cats);
//        }
        oos.writeObject(arrayOfCats);
        fos.close();
        oos.close();
    }
}
