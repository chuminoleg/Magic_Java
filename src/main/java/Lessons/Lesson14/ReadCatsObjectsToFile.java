package Lessons.Lesson14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadCatsObjectsToFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String pathToFile = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java" +
                "\\Lessons\\Lesson14\\cats.bin";
        FileInputStream fis = new FileInputStream(pathToFile);
        ObjectInputStream   ois = new ObjectInputStream(fis);
        int sizeOfCatsArray = ois.readInt();
        Cats[] readCatsArray = new Cats[sizeOfCatsArray];
//        System.out.println(sizeOfCatsArray);
//        for (int i = 0; i < sizeOfCatsArray; i++) {
//             readCatsArray[i]= (Cats) ois.readObject();
//        }
        readCatsArray = (Cats[]) ois.readObject();
        System.out.println(Arrays.toString(readCatsArray));
//        System.out.println(readCatsArray[4]);
        fis.close();
        ois.close();
    }
}
