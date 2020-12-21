package practice11;

import java.awt.*;
import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class AbstractQueue<E> implements Queue<E>{
    protected List<E> queue;

    @Override
    public E element() {
        E element = queue.peek();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean add(E element) {
        if (add(element))
            return true;
        throw new IllegalStateException();
    }

    public boolean addAll(Collections<? extends E> collection) {
        boolean m = false;
        if (collection == null)
            throw new NullPointerException();

        for (E element : collection) {
            add(element)
        }
        return true;
    }

    public abstract int size();

    public E remove(){
        E element = queue.poll();
        if(element != null)
            return element;
        throw new NoSuchElementException();
    }

    @Override
    public String toString() {
        return "AbstractQueue{" +
                "queue=" + queue +
                '}';
    }
}
