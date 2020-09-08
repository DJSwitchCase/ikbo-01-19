    public abstract class Dish {
    private int weight;
    private int number;
    private String color;
    Dish(int w, int n, String c)
    {
        this.weight=w;
        number = n;
        color = c;
    }
    public void setWeight(int w)
    {weight=w;}
    public void setNumber(int n)
    {number=n;}
    public void setColor(String c)
    {color=c;}
    public void getWeight()
    {System.out.println(weight);}
    public void cout()
    {
        System.out.println("Weight = "+weight+"\n"+"Number = "+number+"\n"+"Color = "+color);
    }
    public abstract void display();

}
