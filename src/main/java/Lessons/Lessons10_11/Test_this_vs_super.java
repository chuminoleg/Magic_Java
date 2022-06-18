package Lessons.Lessons10_11;

/* this представляет текущий экземпляр класса
 */
public class Test_this_vs_super {

    public static void main(String[] args) {
//        Animals animals = new Animals();
        Animals animals2 = new Animals("Animal");
    Dog dog = new Dog("Bobik");
//    dog.name = "Bobik";
//    System.out.println(dog.name);
    }

}

class Animals {
    private    String name;
    public Animals() {
        System.out.println("Вызывается конструктор без параметров класса Animals");
    }

    public Animals(String name) {
        this.name = name; //здесь мы обращаемся к текущему экземпляру класса Animals
        System.out.println("Вызывается конструктор с 1 параметром типа String в классе Animals");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}


class Dog extends Animals {

    public Dog() {
        this("Bobik"); //this -> final и присвоить новое значение ей нельзя
        System.out.println("Вызывается конструктор без параметров класса Dog");
    }

    public Dog(String name) {
        super(name);
    }
}
