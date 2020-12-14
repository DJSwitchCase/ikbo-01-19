public class Zadanie2Main
{
    public static void main(String[] args)
    {
    Integer[] intarr = {1,2,3,4,5};
    String[] strarr = {"hello"};
    Double[] doublearr = {2.4,2.3};

        Zadanie2Class <Integer> arr1 = new Zadanie2Class<Integer>(intarr);
        Zadanie2Class <String>  arr2 = new Zadanie2Class<String>(strarr);
        Zadanie2Class <Double>  arr3 = new Zadanie2Class<Double>(doublearr);

        arr1.getArr();
        arr2.getArr();
        arr3.getArr();
    }
}
