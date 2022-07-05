package Lessons.Lesson17.NestedClasses;

public class Tesla {
    private int id;
    private static int internalId;

    //первый тип вложенного класса - нестатический вложенный класс -> относятся к объекту и имеют доступ к его полям
    // нужны, когда объект сложный комплексный и когда его можно разделить на несколько подобъектов
    private class Motor { // подобъект мотор чаще private
        public void startMotor() {
            System.out.println("Motor is starting" + id + " " + internalId);
        }
    }

    // статический вложенный класс, нужен для того, чтобы группировать классы
    public static class Battery{ // чаще паблик поскольку используются извне
        public void chargeBattery() {
            System.out.println("Battery is charging..." + internalId );  // +id - нет доступа к полям объекта
         }
    }

    public Tesla(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor(); // создание подобъекта
        motor.startMotor();

        int x = 1;

        class InternalMethodClass {
            public void doSomething() { // анонимные классы
                System.out.println(x);
                System.out.println(id);
            }
        }
        InternalMethodClass internalMethodClass = new InternalMethodClass();
        test(internalMethodClass);
        System.out.printf("Electric car \"Tesla\" %s is starting%n", id);

    }

    private void test(Object object) {

    }
}
