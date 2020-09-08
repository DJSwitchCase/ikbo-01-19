public class Cups extends Dish {
    private String type;
    Cups(int weight, int number, String color, String type)
    {
        super(weight,number,color);
        this.type=type;
    }
    public void display()
    {
        super.cout();
        System.out.println(type);
    }
}
