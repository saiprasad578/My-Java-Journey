public class graph8 {
    private int[][] m;
    private int n;

    public GraphMatrix(int n) {
        this.n = n;
        m = new int[n][n];
    }

    public void addEdge(int u, int v) {
        m[u][v] = 1;
        m[v][u] = 1;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.print();
    }
}
