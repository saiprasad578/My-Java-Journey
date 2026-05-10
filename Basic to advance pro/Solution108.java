class Solution108 {
    public int minimizeArraySum(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        
        boolean[] present = new boolean[max + 1];
        for (int num : nums) {
            present[num] = true;
        }
        
        int totalSum = 0;
        
        for (int x : nums) {
            int minDiv = x; 
            
            for (int d = 1; d * d <= x; d++) {
                if (x % d == 0) {
                    
                    if (present[d]) {
                        minDiv = d;
                        break; 
                    }
                    
                    if (present[x / d]) {
                        minDiv = Math.min(minDiv, x / d);
                    }
                }
            }
            
            totalSum += minDiv;
        }
        
        return totalSum;
    }
}