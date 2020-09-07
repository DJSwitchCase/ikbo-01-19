package practica1.Sokolovksiy;

public class Ball
{
    private String colour;
    private int radius;
    public Ball()
    {
        colour = "When Gravity Falls";
        radius = 3;
    }
    public Ball(String n)
    {
        colour = n;
        radius = 3;
    }
    public Ball(int x)
    {
        colour="When Gravity Falls";
        radius = x;
    }

    public String getColour()
    {
        return colour;
    }
    public int getRadius()
    {
        return radius;
    }
}
