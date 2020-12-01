import java.math.*;
public class Nomer4 {
    public static int recursion(int A, int k, int s)
    {
        if (A<((int)(Math.pow(10,k)-1)))
        {
            int sum=0;
            int B=A;
            for (int i=0;i<k;i++)
            {
                sum+=B%10;
                B=B/10;
            }
            if (sum==s)
                System.out.println(A); //вывод числа сумма цифр которого равна s
            return recursion(A+1,k,s);
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        int k = 3; //сколько разрядов числа
        int s = 7; //искомая сумма цифр числа
        int A = (int) (Math.pow(10, k-1));
        recursion(A,k,s);

    }
}
