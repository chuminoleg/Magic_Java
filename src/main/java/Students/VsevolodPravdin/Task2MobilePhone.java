package Students.VsevolodPravdin;

public class Task2MobilePhone {
    int number;
    String model;
    Float weight;

    public Task2MobilePhone(int number, String model, Float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Task2MobilePhone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


    public Task2MobilePhone() {
    }

    public Task2MobilePhone(int number, String model) {
        this.number = number;
        this.model = model;
    }


    public static void main(String[] args) {
        Task2MobilePhone ph1 = new Task2MobilePhone(5365, "iphone", 0.167f);
        ph1.number = 5365;
        ph1.model = "iphone";
        ph1.weight = 0.167f;
        reciveCall("dude");
        System.out.println(getNumber(ph1.number));
        System.out.println(ph1);

        Task2MobilePhone ph2 = new Task2MobilePhone(467657, "google", 0.231f);
        ph2.number = 467657;
        ph2.model = "google";
        ph2.weight = 0.231f;
        reciveCall("smith");
        System.out.println(getNumber(ph2.number));
        System.out.println(ph2);

        Task2MobilePhone ph3 = new Task2MobilePhone(34534, "xiaomi", 0.127f);
        ph3.number = 34534;
        ph3.model = "xiaomi";
        ph3.weight = 0.127f;
        reciveCall("bob");
        System.out.println(getNumber(ph3.number));
        System.out.println(ph3);

        Task2MobilePhone ph4 = new Task2MobilePhone(13423, "sony");
        reciveCall(ph4.number, "Jorge");
        sendMessage(134453, 1321321, 131231, 1423421);
        System.out.println(ph4);

    }

    static void sendMessage(int... number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println();
    }

    static void reciveCall(String name) {
        System.out.println("Звонит" + " " + name);
    }

    static void reciveCall(int num, String name) {
        System.out.println("Звонит" + " " + num + " " + name);
    }

    static int getNumber(int number) {
        return number;
    }
}

