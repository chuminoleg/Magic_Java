package Lessons.Lessons19_20_21marathon.Materials;

public class EnumsII {
    // Enum - enumeration перечисляемые
    // как это делали до появления Enum
//    static Animal animal = Animal.CAT;

    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal);
//        Animal animal2 = 100;
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
        }
    }

}
