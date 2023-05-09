package CTDL.HW4;

import java.util.Iterator;

public class ArrayQueue<E> implements QueueInterface<E> {
    private E[] data; 
    private int f = 0; 
    private int sz = 0; 
    private int CAPACITY = 10;

    public ArrayQueue(int capacity) { 
        CAPACITY = capacity;
        data = (E[]) new Object[capacity]; 
    }
    public int size( ) {
        return sz;
    }
    public boolean isEmpty( ) { return (sz == 0); }
    public void enqueue(E e) {
        if (sz == data.length){
            E[] dataTmp = (E[]) new Object[CAPACITY];
            for (int i = 0; i<data.length;i++)
                dataTmp[i] = data[i];
            CAPACITY *=2;
            data = (E[]) new Object[CAPACITY];
            for (int i = 0; i<dataTmp.length;i++)
                data[i] = dataTmp[i];
        }
        int avail = (f + sz) % data.length; 
        data[avail] = e;
        sz++;
    }
    public E first() {
        if (isEmpty( )) return null;
        return data[f];
    }
    public E dequeue( ) {
        if (isEmpty( )) 
                return null;
        if(sz<=CAPACITY/2){
            CAPACITY /=2;
            E[] dataTmp = (E[]) new Object[CAPACITY];
            for (int i = 0; i<sz;i++)
                dataTmp[i] = data[(f+i)%data.length];
            data = (E[]) new Object[CAPACITY];
            for (int i = 0; i<sz; i++)
                data[i] = dataTmp[i];
            f=0;
        }
        E answer = data[f];
        data[f] = null; 
        f = (f + 1) % data.length;
        sz--;
        return answer;
    }
    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}