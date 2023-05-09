package CTDL.HW4;

public interface StackInterface<E> extends Iterable<E> { 
    int getSize();
    void push(E e);
    E getTop();
    void pop();
}    