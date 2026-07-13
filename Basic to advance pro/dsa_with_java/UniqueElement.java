public class UniqueElement {
    public static int findUnique(int[] arr) {
        int result = 0;
        
    
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;
            int mask = (1 << i);
            
            for (int num : arr) {
                if ((num & mask) != 0) {
                    bitSum++;
                }
            }
            
           
            if (bitSum % 3 != 0) {
                result |= mask;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 2, 4, 4, 5, 4}; 
        System.out.println("The unique element is: " + findUnique(arr));
    }
}