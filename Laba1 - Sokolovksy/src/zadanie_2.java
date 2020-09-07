import java.util.Scanner;
public class zadanie_2 {
    public static void main(String[] args) {
        System.out.println("Введите 5 цифр и не жульничайте!");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            if (sc.hasNextInt())
            {
            System.out.println(sc.nextInt());
            }
        }
    }
}
