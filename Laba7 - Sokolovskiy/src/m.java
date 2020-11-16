import java.util.*;

public class m {
    public static void main(String[] args) {
        ArrayList <String> Blist = new ArrayList<>(3);
        Blist.add("6");
        Blist.add("7");

        ArrayList <String> Alist = new ArrayList<>(10);
        Alist.add("0");
        Alist.add("1");
        Alist.add("2");
        Alist.add("3");
        Alist.add("4");
        Alist.add("5");
        Alist.add("8");
        for (String l: Alist)
            System.out.println(l);

        System.out.println(Alist.subList(1, 3));   ///Диапазон работает как [..)
        System.out.println("Выводим Alist после добавления Blist'а");
        Alist.addAll(6, Blist);
        for (String l: Alist)
            System.out.println(l); //Вывод корректен
        Alist.removeAll(Blist);
        System.out.println("Удаляем Blist");
        for (String l: Alist)
            System.out.println(l);
        Alist.trimToSize();
        System.out.println("\n");

        LinkedList <String> Clist = new LinkedList<String>();
        Clist.addFirst("Privet");
        Clist.addFirst("KakDela");
        Clist.addLast("Shto delaesh");
        for (String k: Clist)
            System.out.println(k);
        System.out.println(Clist.getFirst());

        Collection<String> MyCollection = new Collection<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        }
    }
}
