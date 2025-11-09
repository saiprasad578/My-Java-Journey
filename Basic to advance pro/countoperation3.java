class countoperation3 {
    public int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 == 0) return 0;
        if (num1 >= num2) return num1 / num2 + countOperations(num1 % num2, num2);
        return num2 / num1 + countOperations(num1, num2 % num1);
    }

    public static void main(String[] args) {
        countoperation3 s = new countoperation3();
        System.out.println(s.countOperations(7, 3));  // Output: 4
        System.out.println(s.countOperations(12, 5)); // Output: 5
        System.out.println(s.countOperations(9, 6));  // Output: 2
    }
}
