public class Nomer2 {
    static int k =0;
    private static int recursion(int n)
    {
        if (k==n) {
            return 0;
        }
        else
        {
            k++;
            System.out.println(k);
            return recursion(n);
        }
    }
    public static void main(String[] args) {
    recursion(11);
    }
}
