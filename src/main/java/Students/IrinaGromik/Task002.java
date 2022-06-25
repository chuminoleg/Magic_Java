package Students.IrinaGromik;

/** Задача 2. (ООП) Класс MobilePhone.
Создайте класс MobilePhone, который содержит переменные number, model и name.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 Выводит на консоль сообщение “Звонит {name}”.Метод getNumber – возвращает номер телефона.
 Вызвать эти методы для каждого из объектов.Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/

public class Task002 {
    public static void main(String[] args) {
        MobilePhone mobilePhone1 = new MobilePhone(123456, "Nokia", "Arsenii");
        MobilePhone mobilePhone2 = new MobilePhone(456789,"3305LG", "Leonid");
        MobilePhone mobilePhone3 = new MobilePhone(987452, "Iphone1", "Oleg");
        System.out.println(mobilePhone1.name + " " + mobilePhone1.model + mobilePhone1.number);
        System.out.println(mobilePhone2);
        System.out.println(mobilePhone3);
        mobilePhone1.receiveCall(mobilePhone1.name);
        mobilePhone1.getNumber(mobilePhone1.number);
        mobilePhone2.receiveCall(mobilePhone2.name);
        mobilePhone2.getNumber(mobilePhone2.number);
        mobilePhone3.receiveCall(mobilePhone3.name);
        mobilePhone3.getNumber(mobilePhone3.number);
        mobilePhone1.receiveCall2(mobilePhone2.name, mobilePhone2.number);
        mobilePhone1.sendMessage(mobilePhone1.number, mobilePhone2.number, mobilePhone3.number);

    }
}
class MobilePhone {
    int number;
    String model;
    String name;

    public MobilePhone(int number, String model, String name) {
        this.number = number;
        this.model = model;
        this.name = name;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name + ".");
    }
    void getNumber(int number) {
        System.out.println(number);
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public MobilePhone(int number, String name) {
        this.number = number;
        this.name = name;
    }

    void receiveCall2 ( String name, int number) {
        System.out.println("Звонит " + name + " номер телефона "+ number);
    }

    void sendMessage (int ... number) {
        for (int i = 0; i < number.length; i++) {

        System.out.println(number[i]);
        }

    }

}



