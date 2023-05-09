package CTDL.HW4;

public interface QueueInterface<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
} 

