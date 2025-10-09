public class operator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int mod = a % b;

        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isLess = a < b;

        a++;
        b--;

        boolean logicalAnd = (a > b) && (b > 0);
        boolean logicalOr = (a > b) || (b < 0);

        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int leftShift = a << 1;
        int rightShift = a >> 1;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Modulus: " + mod);
        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater: " + isGreater);
        System.out.println("Less: " + isLess);
        System.out.println("a after increment: " + a);
        System.out.println("b after decrement: " + b);
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
    }
}
