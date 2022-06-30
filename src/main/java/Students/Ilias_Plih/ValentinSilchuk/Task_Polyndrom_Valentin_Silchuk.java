package Students.Ilias_Plih.ValentinSilchuk;
/** программа определяет, является ли фраза полиндромом (одинаково читается в прямом направлении и в обратном)
 * при этом исключаются пробелы и не имеет знаечения ригистр*/
import java.util.Scanner;

public class Task_Polyndrom_Valentin_Silchuk {
    public static void main(String[] args) {
        checkPolyndrom(SpacesCase(readString()));
    }


    public static String readString() {//метод возвращает веденную строку
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    public static String SpacesCase(String str) { // метод убирает пробелы и регистр
        String strWithoutSpaces = str.replace(" ", "");
        String strLowerCase = strWithoutSpaces.toLowerCase();
        return strLowerCase;
    }

    public static void checkPolyndrom(String str) { // метод проверяет, являетеся ли строка полиндромом
        Boolean check = false;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < (charArray.length) / 2; i++) {
            if (charArray[i] == charArray[charArray.length - 1 - i]) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Это полиндром");
        } else {
            System.out.println("Это не полиндром");
        }
    }
}