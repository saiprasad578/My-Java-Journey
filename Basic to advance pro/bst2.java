class bst2 {
    static class Node {
        int v;
        Node l, r;
        Node(int v) { this.v = v; }
    }

    Node root;

    public void add(int x) {
        root = add(root, x);
    }

    private Node add(Node n, int x) {
        if (n == null) return new Node(x);
        if (x < n.v) n.l = add(n.l, x);
        else if (x > n.v) n.r = add(n.r, x);
        return n;
    }

    public boolean find(int x) {
        return find(root, x);
    }

    private boolean find(Node n, int x) {
        if (n == null) return false;
        if (x == n.v) return true;
        return x < n.v ? find(n.l, x) : find(n.r, x);
    }

    public void remove(int x) {
        root = remove(root, x);
    }

    private Node remove(Node n, int x) {
        if (n == null) return null;
        if (x < n.v) n.l = remove(n.l, x);
        else if (x > n.v) n.r = remove(n.r, x);
        else {
            if (n.l == null) return n.r;
            if (n.r == null) return n.l;
            Node t = n.r;
            while (t.l != null) t = t.l;
            n.v = t.v;
            n.r = remove(n.r, t.v);
        }
        return n;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node n) {
        if (n == null) return;
        inorder(n.l);
        System.out.print(n.v + " ");
        inorder(n.r);
    }
}
