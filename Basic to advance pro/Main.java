public class Main {
    public static int totalMoney(int n) {
        int weeks = n / 7;
        int days = n % 7;
        int total = 0;
        total += (weeks * (7 * (1 + 7) / 2)) + (7 * (weeks - 1) * weeks / 2);
        total += days * (weeks + 1) + (days * (days - 1)) / 2;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
    }
}
