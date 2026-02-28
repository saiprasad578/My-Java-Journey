public class Poly {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Poly c = new Poly();
        System.out.println(c.add(5, 3));
        System.out.println(c.add(4.2, 3.8));
        System.out.println(c.add(1, 2, 3));
    }
}