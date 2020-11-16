import java.util.Vector;

public class massiv{
static Vector<Integer> massiv;
static int size;
boolean flag=false;
massiv(int x)
{
    this.massiv=new Vector<Integer>(x);
    this.size = x;
    for (int i=0;i<size;i++)
    massiv.add(0);
}

public int utilsize(int x)
{
    return (x%(size/2));
}

public void add (int x, int number)
{
   // if (x!=massiv.elementAt(number))
    massiv.setElementAt(x,number);
    //else if (number!=size)
       // massiv.add(x, number+1);
}
public void delete (int x)
{
    massiv.removeElement(x);
}
public void sout ()
{
    for (int i=0;i<size;i++)
        System.out.print(massiv.elementAt(i)+" ");
    System.out.println("\n");
}
}
