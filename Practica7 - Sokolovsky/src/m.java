import java.util.*;

public class m {
//Карты перечислены не сверху вниз, а снизу вверх, потому что в противном случае мне придётся использовать методы библиотеки Vector, наследуемые Stack (LastElement()), а не "свои" методы Stack'а.
    public static void d (Stack x)
    {
        System.out.println(x);
    }

    public static void main(String[] args) {
        int counter = 0;
        String winner ="";
        Scanner scan = new Scanner(System.in);
        Integer str;

        Stack <Integer> player1 = new Stack<>();
        for (int i=0; i<5;i++)
        {
            str = scan.nextInt();
            player1.push(str);
        }

        Stack <Integer> player2 = new Stack<>();
        for (int i=0; i<5;i++)
        {
            str = scan.nextInt();
            player2.push(str);
        }

        d(player1);
        d(player2);
        System.out.println("\n");
        while(player1.isEmpty()==false && player2.isEmpty()==false)
        {
            counter++;
            if (counter==8)
                break;
            System.out.println(counter);

             if (player1.firstElement()>player2.firstElement()&&(player1.firstElement()!=9 && player2.firstElement()!=0)) {
                 player1.push(player1.firstElement());
                 player1.remove(player1.firstElement());

                 player1.push(player2.firstElement());
                 player2.remove(player2.firstElement());

                 d(player1);
                 d(player2);
                 System.out.println("\n");
             }
             else if (player1.firstElement()==0 && player2.firstElement()==9)
             {
                 player1.push(player1.firstElement());
                 player1.remove(player1.firstElement());

                 player1.push(player2.firstElement());
                 player2.remove(player2.firstElement());

                 d(player1);
                 d(player2);
                 System.out.println("\n");
             }
            else if (player2.firstElement()>player1.firstElement() || (player2.firstElement()==0 && player1.firstElement()==9)) {
                //Первую карту первого вниз колоды второго, удаляем карту первого из начала
                player2.push(player1.firstElement());
                player1.remove(player1.firstElement());

                //Первую карту второго вниз колоды второго, удаляем карту второго из начала
                player2.push(player2.firstElement());
                player2.remove(player2.firstElement());

                d(player1);
                d(player2);
                System.out.println("\n");
            }
        }
        if (player1.isEmpty())
            winner="player1";
        else
            winner="player2";
        System.out.println("Вывод задания:\n"+winner+" "+counter);
    }
}