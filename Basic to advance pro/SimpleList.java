class Node3 {
    int data;
    Node3 next;

    Node3(int d) {
        data = d;
        next = null;
    }
}

public class SimpleList {
    Node3 head;

    void insertFront(int data) {
        Node3 n = new Node3(data);
        n.next = head;
        head = n;
    }

    void print() {
        Node3 t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);
        list.print();
    }
}