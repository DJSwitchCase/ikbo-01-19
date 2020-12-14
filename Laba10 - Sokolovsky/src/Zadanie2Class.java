import java.util.ArrayList;

public class Zadanie2Class<E> {
    private E[] arr;
    private ArrayList<E> arrlist;
    Zadanie2Class(E[] a)
    {
        arr = a;
    }

    public void getArr() {
        for (E e: arr)
            System.out.println(e);
    }
    public void getE(int i)
    {
        if (i>=arr.length)
            throw new java.lang.ArrayIndexOutOfBoundsException("Index: "+i+", Size: "+arr.length);
        System.out.println(arr[i]);
    }
}
