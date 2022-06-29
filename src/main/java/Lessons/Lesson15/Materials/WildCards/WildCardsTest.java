package Lessons.Lesson15.Materials.WildCards;

import java.util.ArrayList;
import java.util.List;

public class WildCardsTest {
    public static void main(String[] args) {
        List<NewAnimal> listOfAnimals= new ArrayList();
        listOfAnimals.add(new NewAnimal(1, "Animal1"));
        listOfAnimals.add(new NewAnimal(2, "Animal2"));
        listOfAnimals.add(new NewAnimal(3, "Animal3"));
        methodTestlistOfAnimals(listOfAnimals);

        System.out.println();

        List<NewDog> newDogList = new ArrayList<>();
        newDogList.add(new NewDog(1, "Animal1"));
        newDogList.add(new NewDog(2, "Animal2"));
        newDogList.add(new NewDog(3, "Animal3"));
        methodTestlistOfAnimals(newDogList); //WildCard

    }
    /*
    * Object
    * NewAnimal
    * Dog
    * */

    private static void methodTestlistOfAnimals(List<? extends NewAnimal> list) {  // <?> extends NewAnimal, super NewAnimal
        for (NewAnimal animal : list) { //
//            animal.eat();
            System.out.println(animal);
        }
    }
}

class NewAnimal {
    private int id;
    private String name;

    public NewAnimal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void eat() {
        System.out.println("Animal is eating!");
    }

    @Override
    public String toString() {
        return "NewAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class NewDog extends NewAnimal {

    public NewDog(int id, String name) {
        super(id, name);
    }
}
