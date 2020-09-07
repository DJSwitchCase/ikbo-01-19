package practica1.Sokolovksiy;

public class Dog
{
    private String name;
    private int weight;
    public Dog()
    {
        name = "Antoha";
        weight = 5;
    }
    public Dog(String n)
    {
        name = n;
        weight = 5;
    }
    public Dog(int x)
    {
        name="Antoha";
        weight = x;
    }

    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
}
