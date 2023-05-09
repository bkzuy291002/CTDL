package CTDL.HW4;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> { 

    class Node {  	
		E element; 
 		Node next; 
 	} 
		 
 	private Node stack = null; 
	 
    private int capacity=1;
    private int t=-1;
    private E[] data;
    public LinkedListStack(){
        data = (E[])new Object[capacity];
    }
    public boolean isFull(){
        return (t==capacity-1);
    }
    public boolean isEmpty(){
        return (t==-1);
    }
    public int getSize(){
        return t+1;
    }
    public void push(E e){
        if (!isFull()){
            t++;
            data[t]=e;
        }
        else{
            E[] tmp = (E[])new Object[capacity];
            for (int i=0;i<t+1;i++)
                tmp[i] = data[i];
            capacity = capacity*2;
            data = (E[])new Object[capacity];
            for (int i=0;i<t+1;i++)
                data[i] = tmp[i];
            t++;
            data[t]=e;
        }
    }
    public E getTop(){
        if (isEmpty())
            return null;
        else
            return data[t];    
    }
    public void pop() {
        if (isEmpty()) 
            return;
        else
             t--;
    }
    public void show(){
        System.out.println("Size = "+getSize());        
        System.out.println("Capacity = "+capacity);
        for (int i=0;i<t+1;i++)
            System.out.println(data[i]);
    }
    public int getCapacity(){
        return capacity;
    }
 	@Override 
 	public Iterator<E> iterator() {  	 	
		// TODO Auto-generated method stub 
 	 		return new StackIterator(); 
 		} 
class StackIterator implements Iterator<E> {  	
		
		private Node currentNode = stack; 

 	 		@Override 
 	 		public boolean hasNext() { 
 	 	 		// TODO Auto-generated method stub 
 	 	 		return currentNode != null; 
 	 			} 
  	 	@Override  	 	
		public E next() { 
 	 		// TODO Auto-generated method stub  	 	 	
			E data = currentNode.element;  	 	 					
            currentNode = currentNode.next;  	 	 	
			return data; 
 	 	} 
 	}
} 
