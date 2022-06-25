package Lessons.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        boolean check = true;
        int[] array = new int[10];
        byte[] byteArray = new byte[10];
        String[] stringArray = new String[10]; // ""

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Hi";
        }
        String str = "Hi";
        String str1 = new String("Hi");
        String[] string2Array = {"Hi", "Hi", "Hi", "Hi", "Hi"};
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Object[] objectArray = {object1, object2, object3};\

        while(check) {
        // операторы
        };

        do {
            // операторы
        } while(check);

        for (String element: stringArray
             ) {
            System.out.println(element + " ");
        }

        String test = "";
        switch(test) {
            case("Hallo"): {}
            break;
            case("Stop"): {}
            break;
            default: {}
            break;
        }

        if(check) {

        } else if (check) { }

        if(check) {
            if(check) {}
        }
    }
}

