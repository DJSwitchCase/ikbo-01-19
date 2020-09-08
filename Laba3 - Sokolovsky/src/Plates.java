public class Plates extends Dish {
    private String type;
    public Plates(int w, int n, String c, String Type)
    {
        super( w, n, c);
        this.type=Type;
    }
    public String getType()
    {
    return type;
    }
    public void display()
    {
        super.cout();
        System.out.println(type);
    }
}
