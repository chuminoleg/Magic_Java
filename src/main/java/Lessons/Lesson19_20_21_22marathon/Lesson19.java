package Lessons.Lesson19_20_21_22marathon;

public class Lesson19 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y); // true

        Aircraft aircraft1 = new Aircraft(23876432);
        Aircraft aircraft2 = new Aircraft(23876432);
        System.out.println(aircraft1 == aircraft2); // false
        // aircraft1 -> {new Aircraft()} aırcraft2 -> {new Aircraft()}
        Object object = new Object();
//        object.equals();
        System.out.println(aircraft1.equals(aircraft2)); //false
    }
}

class Aircraft {
    private int boardId;

    public Aircraft(int boardId) {
        this.boardId = boardId;
    }

    @Override
    public boolean equals(Object obj) {
        Aircraft someAircraft = (Aircraft) obj;
        return this.boardId == someAircraft.boardId;
    }
}
