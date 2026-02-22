class Node2 {
    int data;
    Node2 next;

    Node2(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node2 head;

    void add(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
}class Node2 {
    int data;
    Node2 next;

    Node2(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node2 head;

    void add(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
}