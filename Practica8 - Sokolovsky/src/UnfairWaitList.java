public class UnfairWaitList <E> extends WaitList <E> {
    public UnfairWaitList() {
    }
    public void moveToBack(E element)
    {
    if (this.conLinkQue.remove(element))
        this.conLinkQue.add(element);

    }
    public void remove(E element)
    {
        this.conLinkQue.remove(element);
    }
    }
