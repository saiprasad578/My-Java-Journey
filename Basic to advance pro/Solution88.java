public class Solution88 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};

        int even = 0, odd = 0;

        for (int num : a) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}