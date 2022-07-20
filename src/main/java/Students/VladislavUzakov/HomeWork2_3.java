package Students.VladislavUzakov;

public class HomeWork2_3 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        arrays [0] = 10;
        arrays [1] = 20;
        arrays [2] = 30;
        arrays [3] = 40;
        arrays [4] = 50;
        arrays [5] = 60;
        arrays [6] = 70;
        arrays [7] = 80;
        arrays [8] = 90;
        arrays [9] = 100;
        long a = arrays[0] * arrays[1] * arrays[2] * arrays[3] * arrays[4] * arrays[5] * arrays[6] * arrays[7] * arrays[8] * arrays[9];
        System.out.println(a);
        long b = arrays[0] + arrays[1] + arrays[2] + arrays[3] + arrays[4] + arrays[5] + arrays[6] + arrays[7] + arrays[8] + arrays[9];
        System.out.println(b);


        int maxNum = arrays[0];

        for (int j : arrays) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);

        int minNum = arrays[0];

        for (int j : arrays) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Minimum number = " + minNum);
    }
}