package practica1.Sokolovksiy;

public class TestBall {
    public static void main(String[] args) {
        Ball Football = new Ball ("Red");
        System.out.println("The ball's colour is "+Football.getColour());
        Ball HugeOne = new Ball(500);
        System.out.println("The ball's radius is "+Football.getRadius());
    }
}
