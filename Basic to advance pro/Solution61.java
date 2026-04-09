import java.util.*;

class Solution61 {
    public List<String> findCustomers(int[][] customers, int[][] orders, String[] names) {
        // Store customerIds who placed orders
        Set<Integer> orderedCustomers = new HashSet<>();
        
        for (int[] order : orders) {
            orderedCustomers.add(order[1]); // customerId
        }
        
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < customers.length; i++) {
            int customerId = customers[i][0];
            
            if (!orderedCustomers.contains(customerId)) {
                result.add(names[i]);
            }
        }
        
        return result;
    }
}