public class BoundedWaitList<E> extends WaitList <E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }


    public void add(E element)
    {
        if (this.conLinkQue.size()<this.capacity)
            super.add(element);
    }

    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", conLinkQue=" + conLinkQue +
                '}';
    }
}
