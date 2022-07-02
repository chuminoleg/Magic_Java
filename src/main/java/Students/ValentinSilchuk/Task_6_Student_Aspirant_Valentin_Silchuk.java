package Students.ValentinSilchuk;

/*Задача 6. Наследование Student, Aspirant
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
Создать переменную типа Student, которая ссылается на объект типа Aspirant.
Создать метод getStipendia() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 у.е., иначе 80.
Переопределить этот метод в классе Aspirant.
Если средняя оценка аспиранта равна 5, то сумма 200 у.е, иначе 180.
Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getSstipendia() для каждого элемента массива
*/
public class Task_6_Student_Aspirant_Valentin_Silchuk {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Ivan", "Petrov", "Java111",4.5, "Methods");
        //Создание массива с объектами класса Student и Aspirant
        Student[] students = new Student[5];
        students[0] = new Student("Dmitriy", "Vlasov", "Java110",4.5);
        students[1] = new Student("Sergey", "Ivanov", "Java112",5.0);
        students[2] = new Aspirant("Andrey", "Kuznetsov", "Java113",3.0, "OOP");
        students[3] = new Aspirant("Kirill", "Sidorov", "Java114",5.0,"Java classes");
        students[0].getSipendia();
        students[1].getSipendia();
        students[2].getSipendia();
        students[3].getSipendia();

    }
}

class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
//конструктор для создания объектов класса Student
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    int getSipendia() {
        if (averageMark == 5) {
            System.out.println("Студент " +lastName+" "+firstName+ " получает стипендию " + 100+" у.е.");
            return 100;
        } else {
            System.out.println("Студент " +lastName+" "+firstName+ " получает стипендию " + 80+" у.е.");
            return 80;
        }

    }

}
class Aspirant extends Student {
    String nameOfResearch;
//конструктор для создания объектов класса Aspirant
    public Aspirant(String firstName, String lastName, String group, double averageMark, String nameOfResearch) {
        super(firstName, lastName, group, averageMark);
        this.nameOfResearch = nameOfResearch;
    }
//переопределяем метод родительского класса
    @Override
    int getSipendia() {
        if (averageMark == 5) {
            System.out.println("Аспирант " +lastName+" "+firstName+ " получает стипендию " + 200+" у.е.");
            return 200;
        } else {
            System.out.println("Аспирант " +lastName+" "+firstName+ " получает стипендию " + 180+" у.е.");
            return 180;
        }
    }
}
