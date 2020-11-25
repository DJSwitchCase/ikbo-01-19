import java.util.Collection;

public interface IWaitList <E> {
    E remove();
    boolean contains(E element);
    void add(E element);
    boolean containsall (Collection <E> c);
    boolean isEmpty();
}
