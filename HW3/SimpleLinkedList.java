package CTDL.HW3;


public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        // Thêm phần tử vào đầu danh sách
        Node newLinked = new Node();
        newLinked.data = data;
        newLinked.next = null;
        newLinked.next = top;
        top = newLinked;
        n++;
    }

    public void addBot(T data) {
        // Thêm phần tử vào cuối danh sách
        Node newLinked = new Node();
        newLinked.data = data;
        newLinked.next = null;

        if (top == null) {
            top = newLinked;
        } else {
            Node node = top;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newLinked;
        }
        n++;
    }

    public T get(int i) {
        // Lấy phần tử ở vị trí thứ i
        int k = -1;
        Node currentNode = this.top;
        while (currentNode != null) {
            k++;
            if (k == i) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void set(int i, T data) {
        // Gán giá trị ở vị trí i bằng data
        int k = -1;
        Node currentNode = this.top;
        while (currentNode != null) {
            k++;
            if (k == i) {
                currentNode.data = data;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public boolean isContain(T data) {
        // Kiểm tra trong danh sách có chứa phần tử data hay không?
        Node currentNode = this.top;
        while (currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        // Trả lại thông tin số phần tử có trong danh sách
        return this.n;
    }

    public boolean isEmpty() {
        // Kiểm tra danh sách có rỗng hay không?
        return n == 0;
    }

    public T removeTop() {
        // Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó
        if (isEmpty()) {
            return null;
        }
        this.top = this.top.next;
        n--;
        return null;
    }

    public T removeBot() {
        // Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó
        if (n == 0 || n == 1) {
            return removeTop();
        }
        Node preNode = this.top;
        while ((preNode.next).next != null) {
            preNode = preNode.next;
        }
        preNode.next = null;
        n--;
        return null;
    }

    public void remove(T data) {
        // Xóa tất cả các phần tử có giá trị bằng data
        int k = 0;
        int m = n;
        Node node = this.top;
        while (k < m) {
            if (node.next.data == data) {
                node.next = node.next.next;
                n--;
            }
            if (node.next.next.next != null) {
                node = node.next;
            }
            k++;
        }
        if (this.get(0) == data) {
            removeTop();
        }
        if (this.get(n - 1) == data) {
            removeBot();
        }
    }

    public void show() {
        Node node = top;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}