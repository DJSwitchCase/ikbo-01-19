public class Nomer5 {

    public static int recursion (int n, int sum)
    {
        if (n==0) {
            System.out.println(sum);
            return 0;
        }
        else
        {
            sum+=n%10;
            n=n/10;
           return recursion(n, sum);
        }
    }

    public static void main(String[] args) {
    int n=85;
    int sum=0;
    recursion(n,sum);
    }
}
