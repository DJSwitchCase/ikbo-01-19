public class Test {
    public static void main(String[] args) {
        Plates pl = new Plates(3,4,"Black", "Plate");
        pl.display();
        pl.setWeight(10);
        pl.getWeight();
        Cups c = new Cups(5,6,"White","Cup");
        c.display();
    }
}
