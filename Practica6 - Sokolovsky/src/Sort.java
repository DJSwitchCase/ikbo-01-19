import java.util.*;

public class Sort {

    public static void InsertionSort(Vector<Student> massiv)
    {
        Student temp = null;
        for (int i=1; i<massiv.size();i++)
        for(int j=i; j>0 && massiv.elementAt(j-1).compareTo(massiv.elementAt(j))==-1;j--) {
            temp = massiv.elementAt(j - 1);
            massiv.setElementAt(massiv.elementAt(j),j-1);
            massiv.setElementAt(temp,j);
        }

    }

    public static void main(String[] args) {

        Vector<Student> alo = new Vector<Student> (10);
        Random r = new Random();

        while (alo.size() < 10) {
            int randInt = r.nextInt(10);
            alo.add(new Student(randInt));
        }

        for (int i=0; i<alo.size(); i++)
            System.out.print(alo.elementAt(i).IDNumber+" ");
        System.out.println("\n");
        InsertionSort(alo);
        for (int i=0; i<alo.size(); i++)
            System.out.print(alo.elementAt(i).IDNumber+" ");
    }
}
