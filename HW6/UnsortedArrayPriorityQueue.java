package CTDL.HW6;

public class UnsortedArrayPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {
	protected class ArrEntry<K, E> implements Entry<K, E>{
		K key;          
		E element;
		public ArrEntry (K k, E e){

		}
        @Override
        public K getKey() {
            // TODO Auto-generated method stub
            return null;
        }
        @Override
        public E getValue() {
            // TODO Auto-generated method stub
            return null;
        }
	}
	ArrEntry<K, E> [] array;
	int n = 0;
	int defaultsize = 1000;
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void insert(Entry entry) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void insert(Object k, Object e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Entry removeMin() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Entry min() {
        // TODO Auto-generated method stub
        return null;
    } 
}

