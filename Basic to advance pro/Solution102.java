public class Solution102 {

    public static void main(String[] args) {

        int binary = 1011;
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;

            decimal += digit * Math.pow(2, power);

            power++;
            binary /= 10;
        }

        System.out.println("Decimal value: " + decimal);
    }
}