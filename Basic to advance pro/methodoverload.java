class methodoverload {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        System.out.println("Add two ints: " + obj.add(10, 20));
        System.out.println("Add three ints: " + obj.add(10, 20, 30));
        System.out.println("Add two doubles: " + obj.add(5.5, 2.3));
    }
}
