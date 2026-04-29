class power {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        power obj = new power();

        int n = 16; // change value here

        if (obj.isPowerOfTwo(n))
            System.out.println(n + " is a Power of Two");
        else
            System.out.println(n + " is NOT a Power of Two");
    }
}