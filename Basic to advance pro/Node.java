class Node {
    int val;
    Node left, right;
    Node(int v){ val = v; }
}

public class Main {
    static void inorder(Node r){
        if(r==null) return;
        inorder(r.left);
        System.out.print(r.val+" ");
        inorder(r.right);
    }

    public static void main(String[] args){
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        inorder(root);
    }
}
