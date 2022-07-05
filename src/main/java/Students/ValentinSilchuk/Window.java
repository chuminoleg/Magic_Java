package Students.ValentinSilchuk;

public class Window {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width){
        this.height = height;// добавил this
        this.width = width;//// добавил this
    }

    public void printSize(){
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}
