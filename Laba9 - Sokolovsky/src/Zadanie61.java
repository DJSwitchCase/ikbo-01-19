import java.util.Scanner;

public class Zadanie61
{
        public void getKey()
        {
            Scanner myScanner = new Scanner( System.in );
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            }
            catch(Exception e)
            {
                System.out.println("Ошибка!");
            }
        }

        private void printDetails(String key) throws Exception
        {
            String message = getDetails(key);
            System.out.println( message );
        }

        private String getDetails(String key) throws Exception
        {
            if(key.equals(""))
            {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key;
        }
        static void test()
        {
            for (int i =0; i<5; i++) {
                System.out.println(i);
                if(i<=1)
                return;
                System.out.println(i);
            }
            System.out.println("privet");
        }

    public static void main(String[] args) {
        //Zadanie61 z = new Zadanie61();
        //z.getKey();
        test();

    }
}

