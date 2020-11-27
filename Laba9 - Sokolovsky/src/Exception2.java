import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo()
    {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Вводи int");
            String St = myScanner.next();
            int i = Integer.parseInt(St);
            System.out.println(2/i);
        }
        catch (java.lang.NumberFormatException e)
        {
            System.out.println("Не тот тип данных (не int)");
        }
        catch (java.lang.ArithmeticException e)
        {
            System.out.println("На ноль делить нельзя!");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();

    }
}
