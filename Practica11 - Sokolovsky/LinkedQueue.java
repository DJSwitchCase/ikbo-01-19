package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedQueue<E> extends AbstractQueue<E>{
    LinkedQueue(){
        queue = new LinkedList<E>();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public E poll() {
        if(queue == null)
            return null;
        else
           return queue.remove(0);
    }

    @Override
    public E peek() {
        if(queue == null)
            return null;
        else
            return queue.get(0);
    }
}
