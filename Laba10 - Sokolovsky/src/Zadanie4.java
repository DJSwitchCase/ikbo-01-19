import java.util.ArrayList;

public class Zadanie4 {
    public static <E> void ArrListConverterplus(E[] arr, ArrayList<E> lst)
    {
        for (E it : arr)
            lst.add(it);
        for (int i=0; i<5; i++)
            System.out.println(lst.get(i));
    }

    public static void main(String[] args) {
        Integer[] intarr = {3,4,2,1,2,541,51,51,51,515};
        ArrayList <Integer> arrlst = new ArrayList<>();

        ArrListConverterplus(intarr,arrlst);

    }
}
