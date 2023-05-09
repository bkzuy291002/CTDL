package CTDL.HW5;

public class LinkedBinaryTree<E,T> implements BinaryTreeInterface<T> { 
    	
	protected static class Node<E> {
		private E element; 		// an element stored at this node
		private Node<E> parent; 	// a reference to the parent node (if any)
		private Node<E> left; 	// a reference to the left child 
		private Node<E> right; 	// a reference to the right child
	
		// Constructs a node with the given element and neighbors. ∗/
		public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild){
			// Sinh viên hoàn thiện phương thức
		}
	}
	//update methods
	public Node<E> addRoot(E element) {
        return null;
		// Add element to root of an empty tree
	}
	
	public Node<E> addLeft(Node p, E element) {
        return p;		
		// Add element to left child node of p if empty
	}
	
	public Node<E> addRight(Node p, E element) {
        return p;
		// Add element to right child node of p if empty
	}
	
	public void set(Node p, E element) {
		// set element to nnode p
	}

    @Override
    public T root() {
        // TODO Auto-generated method stub
        return null;
    }

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
    public int numChildren(T p) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public T parent(T p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T left(T p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T right(T p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T sibling(T p) {
        // TODO Auto-generated method stub
        return null;
    }
}

