package practica1.Sokolovksiy;

public class Book
{
    private String name;
    private int length;
    public Book()
    {
        name = "When Gravity Falls";
        length = 200;
    }
    public Book(String n)
    {
        name = n;
        length = 200;
    }
    public Book(int x)
    {
        name="When Gravity Falls";
        length = x;
    }

    public String getName()
    {
        return name;
    }
    public int getLength()
    {
        return length;
    }
}
