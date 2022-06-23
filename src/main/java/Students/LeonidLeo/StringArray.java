package Students.LeonidLeo;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String... args) {
        int i = 0;
        String[] stringArray = new String[5];
        String[] stringArray2 = new String[5];
        Scanner scanner = new Scanner(System.in);
        while(i < stringArray.length) {
            stringArray[i] = scanner.nextLine();
            i++;
        }
        System.out.println(Arrays.toString(stringArray));


        for (int j = 0; j < stringArray2.length; j++) {
            stringArray2[j] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(stringArray2));
    }
}
