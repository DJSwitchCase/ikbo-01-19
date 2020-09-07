package practica1.Sokolovksiy;

public class TestBook {
    public static void main(String[] args) {
        Book Neuromancer = new Book("Neuromancer");
        System.out.println("Muh name-a "+Neuromancer.getName());
        Book EnormousOne = new Book(500);
        System.out.println("The book's length is "+EnormousOne.getLength());
    }
}
