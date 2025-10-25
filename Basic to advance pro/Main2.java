public class Main2 {
    public static int totalMoney(int n) {
        int total = 0;
        int weeks = n / 7;
        int days = n % 7;
        for (int i = 0; i < weeks; i++) {
            for (int j = 1; j <= 7; j++) {
                total += i + j;
            }
        }
        for (int j = 1; j <= days; j++) {
            total += weeks + j;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(4));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney(20));
    }
}
