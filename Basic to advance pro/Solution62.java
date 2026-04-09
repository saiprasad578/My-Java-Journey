import java.util.*;

class Solution62 {
    public List<String> findCustomers(int[][] customers, int[][] orders, String[] names) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < customers.length; i++) {
            int customerId = customers[i][0];
            boolean hasOrder = false;
            
            for (int[] order : orders) {
                if (order[1] == customerId) {
                    hasOrder = true;
                    break;
                }
            }
            
            if (!hasOrder) {
                result.add(names[i]);
            }
        }
        
        return result;
    }
}