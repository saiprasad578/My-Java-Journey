class countoperation2 {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                count += num1 / num2;
                num1 %= num2;
            } else {
                count += num2 / num1;
                num2 %= num1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countoperation2 s = new countoperation2();
        System.out.println(s.countOperations(15, 4)); // Output: 5
        System.out.println(s.countOperations(8, 3));  // Output: 4
        System.out.println(s.countOperations(25, 5)); // Output: 5
    }
}
