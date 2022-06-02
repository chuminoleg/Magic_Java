package Lessons;

public class Lesson2_Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        //                0 .1  2 ..........5..  .....        9
        //var arrays --> [3][0][0][0][0][12][0][0][0][0][0][0]
//        arrays[5] = 12;
//        arrays[0] = 3;
//                i = i +1 == i++;
//        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = 5;
        }
    }
}
