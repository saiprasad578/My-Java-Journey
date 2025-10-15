public class table7 {
    public static void main(String[] args) {
        int number = 7; 
        System.out.println("Multiplication Table of " + number);
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}