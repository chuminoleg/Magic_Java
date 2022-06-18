package Students.VsevolodPravdin;

public class Lesson4Rectangle {
    public static void main(String[] args) {
        int height = 10;
        int width = 20;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i != 0 && j != 0 && i != height - 1 && j != width - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("P");
                }
            }
            System.out.println();
        }
    }
}
