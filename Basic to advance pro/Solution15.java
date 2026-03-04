import java.util.Scanner;
public class Solution15 {
 public static void main (String args []) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the required number :");
 int n = sc.nextInt();
  if (n%2 == 0){
  System.out.println("even number ");
  }
   else {
    System.out.println ("this is odd number");
     if (n>0){
        System.out.println ("this is a positive number ");
     }
   else if (n==0) {
   System.out.println("zero ");   
    }
    else {
System.out.println("this is negative number");
}
     }

 }
}