import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
public static String shtuka(String fileName)
{
    try
    {

        File fileName1 = new File(fileName);
        Scanner sc = new Scanner(fileName1);
        System.out.println("2");
        if (sc.hasNextLine())
            return "kak dela";
        else
            return "alo";
    }
    catch(FileNotFoundException e)
    {
return "privet";
    }
}

    public static void main(String[] args) {
    shtuka("");
    }
}
