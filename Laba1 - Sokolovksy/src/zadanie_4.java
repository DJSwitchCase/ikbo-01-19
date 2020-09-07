import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class zadanie_4 {
    public static void main(String[] args) {
        Random r = new Random();
        Integer[]a=new Integer[r.nextInt(10)]; //Используем класс Integer, а не примитивный тип int, чтобы с помощью библиотеки Collections отсгортировать массиву по убыванию

        System.out.println("Неотсортированный массив:");
        for(int i =0; i<a.length;i++)
        {
        a[i]=r.nextInt(10);
        System.out.println(a[i]);
        }

        Arrays.sort(a);

        System.out.println("Сортированный массив по возрастанию:");
        for(int i =0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        Arrays.sort(a,Collections.<Integer>reverseOrder());
        System.out.println("Сортированный массив по убыванию:");
        for(int i =0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }


}
