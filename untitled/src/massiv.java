import java.util.Vector;

public class massiv {
     Vector<Integer> massiv;
     int x;
    massiv(int x)
    {
        this.massiv=new java.util.Vector<Integer>(x);
        this.x=x;
        for (int i=0;i<x;i++)
            massiv.add(0);
    }
    public void add (int x, int y)
    {
        massiv.add(x, y);
    }
    public void sout()
    {
        for (int i=0; i<this.x;i++)
            System.out.println(massiv.elementAt(i));
    }
    public int zaebalosuka()
    {
        return x;
    }
}
