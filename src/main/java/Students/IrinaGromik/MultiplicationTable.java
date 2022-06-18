package Students.IrinaGromik;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] array2D = new int[10][10];

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                array2D[i][j] = (i+1) * (j+1);
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
