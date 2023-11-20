package lab20;

import java.io.Serializable;

public class Generic<T extends Comparable, V extends Serializable, K extends Animal> {
    private T take;
    private V value;
    private K key;
    public Generic(T take, V value, K key) {
        this.key = key;
        this.value = value;
        this.key = key;
    }

    public T getTake() {
        return take;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }
}
