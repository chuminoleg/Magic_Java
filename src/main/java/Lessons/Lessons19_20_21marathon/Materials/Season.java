package Lessons.Lessons19_20_21marathon.Materials;

public enum Season {
    SUMMER(35), WINTER(-10), AUTUMN(10), SPRING(10); //это не строки, а объекты enum Season ;
    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
// Object -> Enum -> Season
// Object -> Test