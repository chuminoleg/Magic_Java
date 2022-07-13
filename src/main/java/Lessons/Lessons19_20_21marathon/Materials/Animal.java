package Lessons.Lessons19_20_21marathon.Materials;

public enum Animal {
    // сначала без конструктора
    //DOG, CAT, FROG, SHEEP, DUCK
    DOG("собака" ), CAT("кошка"), FROG("лягушка"), SHEEP("овец"), DUCK("утка");

    private String translation;
    // если нет конструктора по умолчанию
    private Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
