package Lessons.Lesson19_20_21_22marathon.Materials;

public class First_EqualsAndStringPool {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y); //true так можем сравнивать все примитивы в Java

        Aircraft airplane = new Aircraft(1); // airplane -> (Object Aircraft свой адрес памяти)
        Aircraft helicopter = new Aircraft(1); // helicopter -> (Object Helicopter свой адрес памяти)
        System.out.println(airplane == helicopter); //false "==" сравнивает ссылки

        // структурное сравнение объектов
        Object object = new Object();
//        object.equals();
        System.out.println(airplane.equals(helicopter)); //false теперь true
//        helicopter = airplane;
//        System.out.println(airplane == helicopter); // true

        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // false мы создали объект через new (не запускается механизм кеширования)
        System.out.println(str1 == str3); // true тут Java ссылает на ту же строку
        // строки сравниваются только по equals
        String str4 = "Hello";
        String str5 = "Hello123".substring(0,5);
        System.out.println(str4 == str5); //используйте equals


    }
}

class Aircraft {
    private int id;

    public Aircraft(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Aircraft someAircraft = (Aircraft) obj;
        return this.id == someAircraft.id; // если равны, то true
    }
}
