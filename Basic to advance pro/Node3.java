class Node3 {
    int data;
    Node3 next;
    Node3(int d) {
        data = d;
    }
}

public class SimpleList {
    Node head;

    void insertFront(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void print() {
        Node t = head;
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
