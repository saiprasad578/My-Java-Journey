import java.util.Scanner ;
public class Solution45 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value :");
        int a = sc.nextInt();
      if (a % 3 == 0 && a % 5 == 0) {
    System.out.println("FIZZBUZZ");
} else if (a % 3 == 0) {
    System.out.println("FIZZ");
} else if (a % 5 == 0) {
    System.out.println("BIZZ");
} else {
    System.out.println("Not divisible by 3 or 5");
}
    }
}