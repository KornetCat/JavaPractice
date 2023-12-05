package lab23;

public class ArrayQueue<T> extends ArrayQueueADT{
    @Override
    public void enqueue(Object a) {
        add(a);
    }

    @Override
    public Object element() {
        return get(0);
    }

    @Override
    public Object dequeue() {
        Object a = element();
        remove(0);
        return a;
    }
}
