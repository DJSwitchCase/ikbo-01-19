public class sad {
    public static void main(String[] args) {

        int B =5861;
        int sum=0;//2
        /*System.out.println(B);
         A = A/10; //43
         B=A%10;   //3
        System.out.println(B);
        A=A/10; //4
        B=A%10; //4
        System.out.println(B);*/
        for (int i=0;i<4;i++)
        {
            sum+=B%10;
            B=B/10;
        }
        System.out.println(sum);
    }
}
