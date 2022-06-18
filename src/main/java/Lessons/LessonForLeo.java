package Lessons;

import java.util.Arrays;
import java.util.Scanner;

public class LessonForLeo {
    public static void main(String[] args) {
        int[][] array2D = new int[10][10];
//        System.out.println(Arrays.deepToString(array2D));
        int i = 0;
        int j;
             while (i < array2D.length) {
            for (j = 0; j < array2D[0].length; j++) {
                array2D[i][j] =  (i + 1) * (j + 1);
            }
            i++;
        }

//             if a > b :System.out.println(b)| sout(c);
//
//             a -> и sout

        System.out.println(Arrays.deepToString(array2D));

             methodScanner();
    }

    static void methodScanner() {
        Scanner scanner  = new Scanner(System.in);
        String str = scanner.nextLine();
    }
}
// 0 -> 1 1 1 1 1 1 1 1 1
// 1 -> 0 0 0 0 0 0 0 0 0
// 2 -> 0 0 0 0 0 0 0 0 0

class Calculator {

}
