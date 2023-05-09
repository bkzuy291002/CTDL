package CTDL.HW3;

import java.util.Iterator;
import java.util.*;
public class SimpleArrayList<T> implements ListInterface<T> {  
    private T[] array;  
    private int n = 0; 
    private int defaultSize = 100; 
 
    public SimpleArrayList() { 
        array = (T[]) new Object[defaultSize]; 
    } 
    public SimpleArrayList(int capacity) {      
        // Hàm dựng với kích thước mảng là capacity 
        defaultSize=capacity;

    } 
    public void add(T data) { 
        // Hoàn thành thân hàm
        array[n]=data; //array[n++];
        n++;
    } 
    public T get(int i) {           
        // Hoàn thành thân hàm
        if(n>0) {
            return array[i];
        }
        return null;
    } 
    public void set(int i, T data) { 
        // Hoàn thành thân hàm
        array[i]=data;
    } 
    public void remove(T data) { 
        // Hoàn thành thân hàm
        for(int i=0;i<n;i++) {
            if(array[i]==data) {
                for(int k=i;k<n;k++) {
                    array[k]=array[k+1];
                }
                n--;
            }
        }
    } 
    public boolean isContain(T data) { 
        // Hoàn thành thân hàm
        for(int i=0; i<n; i++) {
            if(array[i]==data) {
                return true;
            }
        }
        return false;
    } 
    public int size() { 
        // Hoàn thành thân hàm
        return n;
    } 
    public boolean isEmpty() {         
        // Hoàn thành thân hàm
        return size()==0;
    } 
    public Iterator<T> iterator() {  
          //Trả về toàn bộ danh sách    
        // Hoàn thành thân hàm 
        return null;
        }
    private void increaseListSize(){
        array = Arrays.copyOf(array, array.length*2);
        System.out.println("\nNew length: "+array.length);
    }
    public static void main(String a[]){
        SimpleArrayList mal = new SimpleArrayList();
        mal.add(2);
        mal.add(5);
        mal.add(1);
        mal.add(23);
        mal.add(14);
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(29);
        System.out.println( );
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        mal.remove(2);
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }
    } 



