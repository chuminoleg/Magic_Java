package Lessons.Lesson17;

public class AnonymousСlasses {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.canWeld();

        NewRobot robotPlateWeld = new NewRobot(); //создание объекта из класса наследника с переопределенным методом
        robotPlateWeld.canWeld();

        Robot robotPlateWeld2 = new Robot() { // здесь лежит объект наследник класса Robot - но используется только 1 раз
            @Override
            public void canWeld() {
                System.out.println("Robot is welding steel parts");
            }
        }; // не забываем -> ; анонимный класс если нам требуется переопределение метода один раз

        robotPlateWeld2.canWeld();
    }
}


class Robot {
    public void canWeld() {
        System.out.println("Robot is welding steel parts");
    }
}

class NewRobot extends Robot {
    @Override
    public void canWeld() {
        System.out.println("Can weld only plate steel parts"); //переопределили метод родительского класса
//        super.canWeld(); // вызов метода родительского класса
    }
}