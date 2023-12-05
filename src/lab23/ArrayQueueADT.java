package lab23;

import lab15.ActionListenerExample;

import java.util.ArrayList;

public abstract class ArrayQueueADT<T> extends ArrayList {
    public abstract void enqueue(T a);
    public abstract T element();
    public abstract T dequeue();
    public int size(){
        return toArray().length;
    }
}
