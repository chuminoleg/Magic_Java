package Students.Ilias_Plih.ValentinSilchuk;
/*написать три метода, первый умеет считывать с клавиатуры любую строку.
        Второй метод способен развернуть любую строку зеркально (используем цикл и toCharArray от String).
        Все методы должны вызываться в методе main (напоминаю методы, которые вызываются не на объекте, а из класса,
        где создан main, необходимо, чтобы они были static или создавайте отдельный класс с методами
        и на объекте вызывайте все три метода в main. Третий метод выводит любую строку на экран.
        Оба варианта помогут вам лучше познать принципы создания и вызовы методов и объектов.
        StringBuilder.revers пользоваться нельзя!*/

import java.util.Scanner;

public class Lesson6_StringReverse_Valentin_Silchuk {
    public static void main(String[] args) {
        printString(reversString(readString()));
    }
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        scanner.close();
        return stroka;
    }
    static void printString(String stroka) {
        System.out.println(stroka);
    }
    public static String reversString(String stroka) {
        char[] charArray = stroka.toCharArray();
        char temp = ' ';
        for (int i = 0; i < (charArray.length) / 2; i++) {
            temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }
        String strokaReverse = new String (charArray);
       return strokaReverse;
    }
}

