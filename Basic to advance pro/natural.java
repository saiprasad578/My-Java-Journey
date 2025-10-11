public class natural {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        
        System.out.println("Sum of first 10 natural numbers is " + sum);
    }
}
