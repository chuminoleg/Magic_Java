package Students.ValentinSilchuk;

import java.util.ArrayList;

public class Task1_Pyramyd_Valentin_Silchuk {
    /**
     * Задача простая: нужно разобрать пирамиду из бокалов, в чем нам поможет метод removeGlassesReverse.
     * Этот метод должен снимать каждый ряд, начиная сверху (с конца списка). Тебе нужно реализовать этот метод.
     * В тестировании тебе поможет метод main.
     * Попробуй запустить программу и посмотреть на вывод.
     * <p>
     * <p>
     * Requirements:
     * 1. В классе HomeTask.Task_4_Library_Valentin_Silchuk.Solution должен быть публичный статический метод removeGlassesReverse(ArrayList<String>).
     * 2. Метод removeGlassesReverse должен удалить все элементы из переданного списка, начиная с конца
     * (используй метод remove(int) у списка).
     */
    public static class Solution {
        private static ArrayList<String> initList() {
            String glassTop = "       🍷       ";
            String glassSecond = "      🍷🍷      ";
            String glassThird = "     🍷🍷🍷     ";
            String glassFourth = "    🍷🍷🍷🍷    ";
            String glassFifth = "   🍷🍷🍷🍷🍷   ";
            String glassSixth = "  🍷🍷🍷🍷🍷🍷  ";
            String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
            String glassEighth = "🍷🍷🍷🍷🍷🍷🍷🍷";
            ArrayList<String> list = new ArrayList<>();
            list.add(glassEighth);
            list.add(glassSeventh);
            list.add(glassSixth);
            list.add(glassFifth);
            list.add(glassFourth);
            list.add(glassThird);
            list.add(glassSecond);
            list.add(glassTop);
            return list;
        }

        public static void print(ArrayList<String> glasses) {
            for (int i = glasses.size() - 1; i >= 0; i--) {
                System.out.println(glasses.get(i));
            }
        }

        public static void removeGlassesReverse(ArrayList<String> glasses) throws InterruptedException {
            System.out.println("Начинаем разбирать пирамиду...");
            //напишите тут ваш код

            while (glasses.size() != 0) {
                print(glasses);
                glasses.remove(glasses.size() - 1);
                System.out.println();
                Thread.sleep(1000);
            }

            if (glasses.size() == 0) {
                System.out.println("Пирамида разобрана!");
            }
        }

        public static void main(String[] args) throws InterruptedException {
            ArrayList<String> glasses = initList();
            print(glasses);
            removeGlassesReverse(glasses);
            print(glasses);
        }
    }
}

