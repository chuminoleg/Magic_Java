package Students.VsevolodPravdin;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j < i & i % j == 0) {
                    break;
                }
                if (i % j == 0) {
                    System.out.println(i + " - простое число");
                }
            }
        }
    }
}
