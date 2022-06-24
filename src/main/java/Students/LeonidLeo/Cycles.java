package Students.LeonidLeo;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles {


    public static void main(String[] args) {
        int i = 0;
        String[] stringArray = new String[5];
        Scanner scanner = new Scanner(System.in);
        while (i < stringArray.length) {
            stringArray[i] = scanner.nextLine();
            i++;
        }
        System.out.println(Arrays.toString(stringArray));
        scanner.close();
    }
}


