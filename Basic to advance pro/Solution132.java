import java.util.Scanner ;
public class Solution132 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int reverse = sc.nextInt();
        System.out.println("Enter the value to be reverse"+ reverse);
       int units = reverse % 10 ;
       int tens =reverse /10 ;
       int hundreds = reverse /100 ;
       int reversed_number = (units *100) +(tens*10)+hundreds;
       System.out.println("Reversed number is "+reversed_number);
    }
}
