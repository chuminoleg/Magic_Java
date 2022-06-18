package Lessons.Lessons10_11.Materials;

public class GenericClass <T, U, K> {
    T t;
    U u;
    K k;

    public static void main(String[] args) {
        GenericClass<String, String, String> genericClassString = new GenericClass();
        genericClassString.method(" ");
    }

//    <T > T method(U t) {
//        System.out.println(t);
//        return t;
//    }

    <T, U, K> U method(U t) {
        System.out.println(t);
        return t;
    }


}
