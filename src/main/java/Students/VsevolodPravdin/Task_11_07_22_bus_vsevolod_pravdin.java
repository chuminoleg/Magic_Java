package Students.VsevolodPravdin;

public class Task_11_07_22_bus_vsevolod_pravdin {
    /*234 8
465 453 981 463 1235 871 475 981
Пример выходных данных 1:
Will not crash
Пример входных данных 2:
211 5
871 205 123 871 1681
Пример выходных данных 2:
Will crash on bridge 2
*/
    public static void main(String[] args) {
        int[] array1 = new int[]{465, 453, 981, 463, 1235, 871, 475, 981};
        int[] array2 = new int[]{871, 205, 123, 871, 1681};
        System.out.println(checkCrash(234, 8, array1));
        System.out.println(checkCrash(211, 5, array2));

    }

    public static String checkCrash(int height, int amount, int[] bridge) {
        String info = "";
        int bridgeCounter = 1;
        for (int i = 0; i < amount; i++) {
            if (height >= bridge[i]) {
                info = "crash" + " " + "bridge" + " " + bridgeCounter;
                break;
            } else {
                info = "will not crash";
            }
            bridgeCounter += 1;
        }
        return info;
    }
}
