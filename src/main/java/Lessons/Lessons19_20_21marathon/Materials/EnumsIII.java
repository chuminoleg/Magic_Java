package Lessons.Lessons19_20_21marathon.Materials;

public class EnumsIII {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        //switch

        System.out.println(season instanceof Season); // проверка является season типа класса Season
        System.out.println(season instanceof Enum);
        System.out.println(season.getClass());


        System.out.println(season.getTemperature());
    }
}
