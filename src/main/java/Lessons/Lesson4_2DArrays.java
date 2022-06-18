package Lessons;

import java.util.Arrays;

public class Lesson4_2DArrays {
    public static void main(String[] args) {
        String[] strArray = {"Hi ", "Java", "!"};
        String str2 = Arrays.toString(strArray);
        System.out.println(str2);
        System.out.println(Arrays.toString(strArray));

        int[] array = new int[10];
        int[] array2 = {1, 3, 45, 67};

        int[][] array2D = new int[3][4];
        int[][] array2DII = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println(array2D.length);
        System.out.println(array2D[0].length);

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                array2D[i][j] = 1;
            }
        }

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(Arrays.deepToString(array2D));


        int[][][] array3D = new int[3][4][5];
        int[][][] array3DII = {{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}}, {{9, 10, 11}, {12, 13, 14}, {15, 16, 17}},
                {{18, 19, 20}, {21, 22, 23}, {24, 25, 26}}};
        System.out.println(Arrays.deepToString(array3DII));
    }
}

