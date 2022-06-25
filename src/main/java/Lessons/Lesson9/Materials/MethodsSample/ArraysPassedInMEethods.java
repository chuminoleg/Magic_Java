package Lessons.Lesson9.Materials.MethodsSample;

import java.util.Arrays;

public class ArraysPassedInMEethods {
    public static void main(String[] args) {
      printArray(buildArray(10));
    }

    static int[] buildArray(int size) {
        int[] array = new int[size];
        return array;
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
