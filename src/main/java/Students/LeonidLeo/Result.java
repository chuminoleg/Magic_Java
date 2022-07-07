package Students.LeonidLeo;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;


public class Result {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int[] firstStream = new int[10];
        int[] secondStream = new int[10];
        for (int i = 0; i < firstStream.length; i++) {
            int c = random.nextInt(10);
            firstStream[i] = c;
        }
        for (int i = 0; i < secondStream.length; i++) {
            int c = random.nextInt(10);
            secondStream[i] = c;
        }
        if (finder(firstStream, secondStream) > 0) {
            System.out.println("найдено совпадение по индексам: ");
            System.out.println(Arrays.toString(firstStream));
            System.out.println(Arrays.toString(secondStream));
            FileOutputStream fs = new FileOutputStream("src/main/java/Students/LeonidLeo/output.txt");
            PrintStream ps = new PrintStream(fs);
            ps.print(statistic(firstStream, secondStream));
        }
    }

    static int finder(int[] first, int[] second) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (first[i] - second[i] == 0) {
                count = count + 1;
            }
        }
        return count;
    }

    static String statistic(int[] a, int b[]) {
        String first = Arrays.toString(a);
        String second = Arrays.toString(b);
        return (first + " " + second);
    }
}




