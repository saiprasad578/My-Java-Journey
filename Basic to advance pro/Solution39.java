public class Solution39 {
    public int smallestNumber(int n) {
        int k = Integer.toBinaryString(n).length();
        return (1 << k) - 1;
    }
} 
    

