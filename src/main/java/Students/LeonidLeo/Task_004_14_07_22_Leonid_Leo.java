package Classes;
/**
 Назад в прошлое
 В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными.
 Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя),
 а также починить геттер и сеттер поля intArray.
 Пример:
 var console = new Scanner(System.in);
 Заменить на:
 Scanner console = new Scanner(System.in);
 Requirements:
 1. Замени типы переменных c var на конкретный тип объекта.
 2. Почини геттер и сеттер для поля intArray.

 */
public class Task_004_14_07_22_Leonid_Leo {


    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Task_005_14_07_22_Leonid_Leo solution = new Task_005_14_07_22_Leonid_Leo();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}