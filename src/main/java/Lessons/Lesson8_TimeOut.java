package Lessons;

public class Lesson8_TimeOut {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 100; i > 0; i--) {
            System.out.print(i + "\r");
            Thread.sleep(1000);
        }
    }
}
