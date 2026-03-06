import java.util.Scanner;
public class Solution19 {
    public static void main(String [] args ){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     int temp = a;
         b=a;
         b = temp;
         System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
