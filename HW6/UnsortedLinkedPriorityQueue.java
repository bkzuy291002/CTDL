package CTDL.HW6;

public class UnsortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface { 
	protected class NodeEntry<K, E> implements Entry<K, E>{
		private K key;
		private E element;
		private NodeEntry<K, E> next;
		public NodeEntry (K k, E e){

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
	private NodeEntry<K,E> head;
	private NodeEntry<K,E> tail;
		int n = 0;
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

