public class Nomer1 {
    public static int recursion(int i, int k) {
        if (k == 0)
            return 0;
        else {
            System.out.println(i);
            k--;
            return recursion(i, k);
        }
    }
        public static void main (String[]args){
            for (int i = 1; i < 5; i++)
                recursion(i, i);
        }
    }
