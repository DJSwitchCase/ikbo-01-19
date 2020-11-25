import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> conLinkQue;
    public WaitList()
    {
        this.conLinkQue = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection <E> c)
    {
        this.conLinkQue = new ConcurrentLinkedQueue<>(c);
    }
    public void add(E element) {
        this.conLinkQue.add(element);
    }

    public E remove() {
        return this.conLinkQue.poll();
    }

    public boolean contains(E element) {
        return conLinkQue.contains(element);
    }

    public boolean containsall(Collection c) {
        return conLinkQue.containsAll(c);
    }

    public boolean isEmpty() {
        return this.conLinkQue.isEmpty();
    }

    public String toString()
    {
        return this.conLinkQue.toString();
    }

}
