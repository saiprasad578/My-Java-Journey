class display {
    void show(int a) {
        System.out.println("Integer value: " + a);
    }

    void show(String s) {
        System.out.println("String value: " + s);
    }

    void show(double d) {
        System.out.println("Double value: " + d);
    }

    public static void main(String[] args) {
        display d = new display();

        d.show(50);
        d.show("Hello Java");
        d.show(3.14);
    }
}
