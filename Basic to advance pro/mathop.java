class mathop {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Test {
    public static void main(String[] args) {
        mathop m = new mathop();
        System.out.println(m.add(5, 10));
        System.out.println(m.add(5, 10, 15));
    }
}
