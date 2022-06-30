package Students.Ilias_Plih.ValentinSilchuk;

import java.util.Arrays;

/*Класс MobilePhone.
        Создайте класс MobilePhone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”.
        Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс Phone, который принимает на вход три параметра
        для инициализации переменных класса - number, model и weight.
        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        Добавить конструктор без параметров.
        Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
        Вызвать этот метод.
        Создать метод sendMessage с аргументами переменной длины.
        Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
        Метод выводит на консоль номера этих телефонов.*/
public class Task_2_MobilePhone_Valentin_Silchuk {
    public static void main(String[] args) {
        MobilePhone Phone1 = new MobilePhone(); //создаем 1 объект класса
        Phone1.number = "89268117761";
        Phone1.model = "iPhone";
        Phone1.weight = 150;
        MobilePhone Phone2 = new MobilePhone("89157287582","Nokia"); // создаем объект класса с помощью конструктора с 2мя параметрами
        MobilePhone Phone3 = new MobilePhone("78899","Xiaomi", 250); // создаем объект класса с помощью конструктора с 3мя параметрами
        Phone1.recieveCall("Steve", "+1 233 994 43 22");
        Phone2.getNumber();
        Phone3.sendMessage("1234235346","32423534636");
    }
}
class MobilePhone {
    //параметры класса
    String number;
    String model;
    int weight;

    public MobilePhone(String number, String model, int weight) {
        //конструктор с 3мя параметрами, который вызывает конструктор с 2мя параметрами
        this(number,model);
        this.weight = weight;
    }

    public MobilePhone(String number, String model) {
        //конструктор с 2мя параметрами,
        this.number = number;
        this.model = model;
    }

    public MobilePhone() {
        // конструктор без параметров
    }
    public void recieveCall(String incomingCallName, String incomingCallNumber){
        //принимает два параметра - имя звонящего и номер телефона звонящего
        System.out.println("Вам звонит "+ incomingCallName + " "+ incomingCallNumber);
    }
    public void sendMessage(String...recipientNumbers) {
        // метод  с аргументами переменной длины.принимает на вход номера телефонов, которым будет отправлено сообщение
        System.out.println("Сообщение отправлено адресатам"+ Arrays.toString(recipientNumbers));
    }
    String getNumber () {
        //возвращает номер телефона
        System.out.println(number);
        return number;
    }
}