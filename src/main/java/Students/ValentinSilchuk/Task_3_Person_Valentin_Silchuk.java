package Students.ValentinSilchuk;
/**Создать класс Person, который содержит:  переменные fullName, age;
 методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 Добавьте два конструктора  - Person() и Person(fullName, age).
 Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
*/
public class Task_3_Person_Valentin_Silchuk {
    public static void main(String[] args) {
        Person Person1 = new Person("James Bond", 38); //создание объекта класса через конструктор с 2мя параметрами
        Person Person2 = new Person();//создание объекта класса через конструктор без параметров
        Person1.talk();
        Person2.move();
    }

    static class Person { // почему среда разработки потребовала Static?
        String fullName;
        int age;

        void talk (){
            System.out.println(fullName + " говорит");
        }
        void move (){
            System.out.println(fullName + " идет");
        }

        public Person() {
            //конструктор без параметров
        }

        public Person(String fullName, int age) {
            //конструктор с 2мя параметрами
            this.fullName = fullName;
            this.age = age;
        }
    }
}