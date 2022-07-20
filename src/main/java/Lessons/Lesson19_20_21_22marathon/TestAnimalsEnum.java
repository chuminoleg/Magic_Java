package Lessons.Lesson19_20_21_22marathon;

public class TestAnimalsEnum {
    public static void main(String[] args) {
        AnimalsEnum animalsEnum = AnimalsEnum.CAT;
        switch (animalsEnum) {
            case DOG:
                System.out.println("It's a DOG");
                break;
            case CAT:
                System.out.println("It's a CAT");
                break;
            case DUCK:
                System.out.println("It's a DUCK");
                break;
        }
    }
}
