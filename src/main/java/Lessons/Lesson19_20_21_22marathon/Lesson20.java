package Lessons.Lesson19_20_21_22marathon;

public class Lesson20 {
    private static final int CAT = 1;
    private static final int DOG = 2;
    private static final int DUCK = 3;

    public static void main(String[] args) {

        // 1 -> кошка, 2 -> собака, 3 -> утка
        Animals animal = new Animals();
        animal.id = DOG;
        switch (animal.id) {
            case 1 :
                System.out.println("это кошка");
                break;
            case 2 :
                System.out.println("это собака");
                break;
            case 3:
                System.out.println("это утка");
                break;
            default:
                System.out.println("Животное не определено");

        }
    }
}

class Animals {
    public int id;
}
