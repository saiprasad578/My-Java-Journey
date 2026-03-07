import java.util.Scanner;

class Solution20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // swap first and third without temp
        a = a + c;
        c = a - c;
        a = a - c;

        System.out.println("Swapped: " + a + " " + b + " " + c);

        String concat = "" + a + b + c;
        System.out.println("Concatenation: " + concat);

        int sum = 0;

        for(int i = 0; i < concat.length(); i++){
            sum += concat.charAt(i) - '0';
        }

        System.out.println("Digit Sum: " + sum);
    }
}