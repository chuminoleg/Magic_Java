package Students.ValentinSilchuk;

import java.util.*;

/**
 * Написать программу, у которой есть методы
 * считывания данных типа Integer, с обязательной проверкой что входные данные соответствуют запрашиваемому типу,
 * далее сохранение в динамический массив, условие остановки считывания данных слово "STOP" (ignoreCase!).
 * Есть методы сортировки от меньшего к большему
 * и от большего к меньшему (для сортировки запрограммировать пузырьковую сортировку)
 * и есть вывод на экран данных массива.
 * <p>
 * Минимальное количество входных данных 20 чисел. Можно использовать генератор случайных чисел (класс Random) и не считывать их с
 * Варианты данных - 1 ручной ввод с обработкой 2 - генерация случайных чисел.
 * <p>
 * Если генерация случайных чисел то Random + цикл -> ArrayList
 * <p>
 * Если чтение с клавиатуры или из файла то не забывай hasNexInt()
 * <p>
 * Строго можно было массив применять, но в учебных целях прошу создать динамический массив.


К данной задаче есть задание посложнее: *
 написать дополнительные методы к задаче выше, реализующие алгоритм сортировки полученных данных сортировкой выбора
 и добавить метод сравнения скорости работы алгоритмов.

 Задание ** к задаче выше:
 дописать методы сортировки данных вставками, пирамидальной сортировки, сортировки слиянием и быстрой сортировки
 и провести сравнение скорости вычислений с выдачей результата в текстовый файл в виде таблицы значений:
 исходные полученные данные, метод сортировки от меньшего к большему и реверс
 (от большего к меньшему) + алгоритм сортировки =  время выполнения в мсек (для прямой и реверс сортировки).
 Определить алгоритм победитель и вывести его название красным цветом.*/

public class Task_Sort_Valentin_Silchuk {
    public static void main(String[] args) {
        List notSortedRandom = setArrayListRandom(); // создание динамического массива из случайных чисел
        System.out.println("Array of random numbers:");
        printList(notSortedRandom);
        System.out.println("Same numbers bubble sorted ascending:");
        printList(bubbleSortListAsc(notSortedRandom)); // сортировка "пузырьком" динамического массива из случайных чисел по возростанию
        System.out.println("...and descending:");
        printList(bubbleSortListDesc(notSortedRandom));// сортировка "пузырьком" динамического массива из случайных чисел по убыванию
        List notSortedManually = setArrayListManually(); // создание динамического массива из чисел, введенных пользователем
        System.out.println("Your numbers bubble sorted ascending: ");
        printList(bubbleSortListAsc(notSortedManually));// сортировка "пузырьком" динамического массива из чисел, введенных пользователем по возростанию
        System.out.println("Your numbers bubble sorted descending: ");
        printList(bubbleSortListDesc(notSortedManually));// сортировка "пузырьком" динамического массива из чисел, введенных пользователем по убыванию
        System.out.println("Array of random numbers selection sorted descending");
        printList(selectionSortListAsc(notSortedRandom));// сортировка "выбором" динамического массива из случайных чисел по возростанию
        System.out.println("Array of random numbers selection sorted descending");
        selectionSortListDesc(notSortedRandom);// сортировка "выбором" динамического массива из случайных чисел по убыванию
        measureTimeBubbleSelection();
    }

    static List setArrayListRandom() { // метод создания динамического массива из случайных чисел
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 2000; i++) {
            Random randomInt = new Random();
            listOfNumbers.add(randomInt.nextInt()); // от 0 до 100 для лучшей читабельности результатов
        }
        return listOfNumbers;
    }

    static List setArrayListManually() { // метод создание динамического массива из чисел, введенных пользователем
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) { // проверка на тип данных
                listOfNumbers.add(scanner.nextInt());
                scanner.nextLine();
            } else if (scanner.nextLine().equalsIgnoreCase("Stop")) { // условие остановки записи данных в массив
                break;
            } else
            System.out.println("Wrong number"); // если было введено не инт
        }
        scanner.close();

        return listOfNumbers;
    }

    static List<Integer> bubbleSortListAsc(List<Integer> list) { // сортировка динамического массива "пузырьком" в порядке по возрастанию
        int temp;
        int rearrengment; // переменная, хранящая значение количества перестановок елементов массива за один проход от конца массива к началу,
        do {
            rearrengment = 0;
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i) < list.get(i - 1)) {
                    temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    rearrengment++;
                } else {
                    continue;
                }
            }
        } while (rearrengment != 0); // если за 1 проход по всем элементам массива перестановок не было -> значит лист отсортирован
        return list;
    }

    static List<Integer> bubbleSortListDesc(List<Integer> list) {// сортировка динамического массива "пузырьком" в порядке по убыванию
        int temp;
        int rearrangement;
        do {
            rearrangement = 0;
            for (int i = list.size() - 1; i > 0; i--) {
                if (list.get(i) > list.get(i - 1)) { // отличие от sortListAsc только в знаке
                    temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    rearrangement++;
                } else {
                    continue;
                }
            }
        } while (rearrangement != 0);
        return list;
    }
    static List<Integer> selectionSortListAsc(List<Integer> list) {// сортировка динамического массива "выбором" в порядке по возростанию
       int arrayLength = list.size(); // сохраняем размер исходного массива в переменную
        List <Integer> sortedList = new ArrayList<>(); // создаем новый пустой динамический массив
        for (int i = 0; i < arrayLength; i++) {
            sortedList.add(Collections.min(list));// добавляем минимальный элемент исходного массива в новый массив
            list.remove(list.indexOf(Collections.min(list))); // удаляем минимальный объект из исходного массива
        }
        return sortedList;
    }

    static List<Integer> selectionSortListDesc(List<Integer> list) {// сортировка динамического массива "выбором" в порядке по убыванию
        int arrayLength = list.size(); // сохраняем размер исходного массива в переменную
        List <Integer> sortedList = new ArrayList<>(); // создаем новый пустой динамический массив
        for (int i = 0; i < arrayLength; i++) {
            sortedList.add(Collections.max(list));// добавляем максимальный элемент исходного массива в новый массив
            list.remove(list.indexOf(Collections.max(list))); // удаляем максимальный объект из исходного массива
        }
        return sortedList;
    }

    static void printList (List list){ // метод для вывода элементов массива
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }

    static void measureTimeBubbleSelection(){
        List TestListRandom1 = setArrayListRandom();
        long startTimeBubble = System.currentTimeMillis();
        bubbleSortListAsc(TestListRandom1);
        long endTimeBubble = System.currentTimeMillis();
        System.out.println("Time for Bubble sort, ms: " + (endTimeBubble-startTimeBubble));
        List TestListRandom2 = setArrayListRandom();
        long startTimeSelection = System.currentTimeMillis();
        selectionSortListAsc(TestListRandom2);
        long endTimeSelection = System.currentTimeMillis();
        System.out.println("Time for Selection sort, ms: " + (endTimeSelection-startTimeSelection));
    }
}
