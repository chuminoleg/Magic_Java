package Lessons.Lesson19_20_21_22marathon;

public class TestSeason {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch(season) {
            case AUTUMN:
                System.out.println("это осень");
                break;
            case WINTER:
                System.out.printf("это зима");
                break;
            case SPRING:
                System.out.println("это весна");
                break;
            case SUMMER:
                System.out.println("это лето");
                break;
        }
        System.out.println(season instanceof Season); //boolean
        System.out.println(season.getClass()); //--> data
        System.out.println(season.getTemperature());
        System.out.println(season);

        Season season1 = Season.valueOf("NO");
        System.out.println(season.ordinal());

        int x = Integer.parseInt("157");
//        int y = new String().valueOf("157");


    }
}
