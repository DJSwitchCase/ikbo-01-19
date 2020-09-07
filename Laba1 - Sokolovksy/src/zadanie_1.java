import java.util.Random;
public class zadanie_1 {
   static void for_cycle(int[] k, Random m)
    {
        System.out.println("It's for_cycle speaking: ");
        for (int i =0; i<k.length; i++)
        {
            k[i]=m.nextInt(10);
            System.out.println(k[i]);
        }
    }
    static void while_cycle(int[]k, Random m)
    {
        System.out.println("It's while_cycle's time to shine!");
        int i=0;
        while (i!=k.length)
        {
            k[i]=m.nextInt(10);
            System.out.println(k[i]);
            i++;
        }
    }
    static void do_while_cycle(int[]k, Random m)
    {
        System.out.println("It's do_while_cycle's turn.");
        int i=0;
        do
        {
            k[i]=m.nextInt(10);
            System.out.println(k[i]);
            i++;
        } while(i!=k.length);
    }
    public static void main(String[] args) {
        int[]a=new int[10];
        Random r = new Random();
        for_cycle(a, r);
        while_cycle(a,r);
        do_while_cycle(a,r);
    }
}
