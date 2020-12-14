import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static <E> void StringNumberconverterArrList(E[] arr, ArrayList <E> lst)
    {
    for (E it : arr)
        lst.add(it);
    }

    public static void main(String[] args) {
        ArrayList <Integer> arrlistint = new ArrayList<Integer>();
        ArrayList <String> arrliststr = new ArrayList<String>();

       Integer[] intarr = {10,20,30,40};
       String[] strarr = {"hello", "whatsup"};

       StringNumberconverterArrList(intarr, arrlistint);
       StringNumberconverterArrList(strarr, arrliststr);

       for (Integer i: arrlistint)
           System.out.println(i);

       for (String i: arrliststr)
           System.out.println(i);
    }
}
