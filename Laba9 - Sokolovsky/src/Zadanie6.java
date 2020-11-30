import java.util.Scanner;

public class Zadanie6
{
    public void getKey()
    {
    Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
    String key = myScanner.nextLine();
    printDetails(key);
}
    public void printDetails(String key) {
            String message = getDetails(key);
            System.out.println( message );
    }
    private String getDetails(String key)
    {
        try
        {
            if(key.equals(""))
            {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key;
        }

        catch(Exception e)
        {
            return("Отдыхай");
        }
    }

    public static void main(String[] args)
    {
        Zadanie6 z = new Zadanie6();
        z.getKey();
    }
}