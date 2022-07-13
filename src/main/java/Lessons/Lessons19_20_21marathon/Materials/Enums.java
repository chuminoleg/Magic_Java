package Lessons.Lessons19_20_21marathon.Materials;

public class Enums {
    // Enum - enumeration перечисляемые
    // как это делали до появления Enum
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 3;
    private static final int SHEEP = 4;
    private static final int DUCK = 5;

    public static void main(String[] args) {
        int animal = DOG; // целочисленная переменная не предназначена для обозначения например животных
        switch (animal) {
            case DOG:
                System.out.println("It's a DOG");
                break;
            case CAT:
                System.out.println("It's a CAT");
                break;
            case FROG:
                System.out.println("It's a FROG");
                break;
            case SHEEP:
                System.out.println("It's a SHEEP");
                break;
            case DUCK:
                System.out.println("It's a DUCK");
                break;
            default:
                System.out.println("It's not animal");
                break;
        }
    }

}
