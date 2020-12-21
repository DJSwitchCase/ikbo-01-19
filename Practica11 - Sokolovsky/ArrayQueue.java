package practice11;

import java.util.ArrayList;

public class ArrayQueue <E> extends AbstractQueue<E>{
   public ArrayQueue(){
       queue = new ArrayList<E>();
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
