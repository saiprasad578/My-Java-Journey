class bst {
    class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    Node root;

    public void insert(int v) {
        root = insertRec(root, v);
    }

    private Node insertRec(Node n, int v) {
        if (n == null) return new Node(v);
        if (v < n.val) n.left = insertRec(n.left, v);
        else if (v > n.val) n.right = insertRec(n.right, v);
        return n;
    }

    public boolean search(int v) {
        return searchRec(root, v);
    }

    private boolean searchRec(Node n, int v) {
        if (n == null) return false;
        if (v == n.val) return true;
        if (v < n.val) return searchRec(n.left, v);
        return searchRec(n.right, v);
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node n) {
        if (n == null) return;
        inorderRec(n.left);
        System.out.print(n.val + " ");
        inorderRec(n.right);
    }
}
