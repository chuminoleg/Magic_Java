package Lessons.Lesson11.Materials;

public class LeonidQuestion implements Dividable{

    @Override
    public void divide() {
        System.out.println();
    }

    @Override
    public void write() {
        System.out.println();
    }

    @Override
    public void read() {

    }

}

class TestDividable implements Dividable{

    @Override
    public void divide() {

    }

    @Override
    public void write() {

    }

    @Override
    public void read() {
        System.out.println();
    }
}
