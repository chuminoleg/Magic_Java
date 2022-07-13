package Lessons.Lessons19_20_21marathon;

public enum Season {
    SUMMER(30), WINTER(-10), AUTUMN(10), SPRING(15);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "temperature=" + temperature +
                '}';
    }
}
