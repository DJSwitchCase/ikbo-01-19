import java.util.Scanner;
public class zadanie_5 {
    public static void main(String[] args) {
        System.out.println("Введите n");

        Scanner sc = new Scanner(System.in);
        int factorialN=sc.nextInt();

        int number = 1;
        for (int i=1;i<=factorialN;i++)
        {
            number*=i;
        }
        System.out.println("Факториал равен"+"\n"+number);
    }
}
