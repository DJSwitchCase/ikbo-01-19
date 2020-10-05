public class Nomer3 {

    public static int recursion(int A, int B)
    {
        System.out.println(A);
        if (A<B)
            A++;
        else if (A>B)
            A--;
        else if (A==B)
            return 0;

        return recursion(A,B);
    }

    public static void main(String[] args) {
    int A=5;
    int B=1;
    recursion(A,B);
    }
}
