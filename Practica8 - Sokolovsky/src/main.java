import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //Выводим "ограниченный" список ожидания, выходим за объём для проверки правильности работы
        WaitList<Integer> Blist = new BoundedWaitList<>(3);
        Blist.add(1);
        Blist.add(2);
        Blist.add(3);
        Blist.add(4);
        Blist.add(5);
        Blist.add(6);
        Blist.add(7);
        System.out.print("Blist: " + Blist.conLinkQue + "\n");

        //Выводим "несправедливый" список ожидания, удаляем элементы
        WaitList<Integer> Ulist = new UnfairWaitList<>();
        Ulist.conLinkQue.add(1);
        Ulist.conLinkQue.add(2);
        Ulist.conLinkQue.add(3);
        Ulist.conLinkQue.remove(2);
        Ulist.conLinkQue.remove(3);
        System.out.print("Ulist " + Ulist.conLinkQue + "\n");

        //Базовый лист ожидания
        WaitList<Integer> WList = new WaitList<Integer>();
        WList.conLinkQue.add(1);
        WList.conLinkQue.add(2);
        WList.conLinkQue.add(3);
        WList.conLinkQue.add(4);
        WList.conLinkQue.add(5);
        WList.conLinkQue.remove(5);
        System.out.print("List Contains 4 - " + WList.conLinkQue.contains(4) + "\n");

        //Проверяем containsAll у Wlist'а
        ArrayList<Integer> lst5 = new ArrayList<Integer>();
        lst5.add(1);
        lst5.add(2);
        lst5.add(3);
        lst5.add(4);
        System.out.print("List Contains all - " + WList.conLinkQue.containsAll(lst5)+"\n");
    }
}
