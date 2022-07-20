package Lessons.Lesson19_20_21_22marathon.Materials;

public class EnumsIV {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season.name());
        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        Season season2 = Season.WINTER;
        System.out.println(season2.ordinal()); // порядковый номер
    }
}
