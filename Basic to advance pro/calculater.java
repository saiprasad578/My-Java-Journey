public class calculater {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The difference when " + b + " is subtracted from " + a + " is: " + diff);
        System.out.println("The product of " + a + " and " + b + " is: " + prod);
        System.out.println("The division of " + a + " by " + b + " is: " + quot);
    }
}