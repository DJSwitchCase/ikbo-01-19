import java.util.Vector;

public class Hash {
    Vector<Integer> hashmassiv;
    int size;
    Hash(int x)
    {
        this.hashmassiv=new Vector<>(x);
        this.size = x;
    }
    public void HashFunction(int x)
    {
        hashmassiv.add(x%size);
    }
}
