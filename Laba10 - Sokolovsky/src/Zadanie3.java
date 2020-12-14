public class Zadanie3 {
    public static void main(String[] args) {
        Integer[] intarr = {2,3,4,56};
        String[] strarr = {"hey","alo"};
        Zadanie2Class arrint = new Zadanie2Class<Integer>(intarr);
        arrint.getE(2);

        Zadanie2Class arrstr = new Zadanie2Class<String>(strarr);
        arrstr.getE(0);
    }
}
