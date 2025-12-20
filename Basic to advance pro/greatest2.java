import java.util.*;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();
        for (int n : nums) {
            sum += n;
            if (n % 3 == 1) r1.add(n);
            else if (n % 3 == 2) r2.add(n);
        }
        Collections.sort(r1);
        Collections.sort(r2);
        if (sum % 3 == 1) {
            int a = r1.size() > 0 ? r1.get(0) : Integer.MAX_VALUE;
            int b = r2.size() > 1 ? r2.get(0) + r2.get(1) : Integer.MAX_VALUE;
            sum -= Math.min(a, b);
        } else if (sum % 3 == 2) {
            int a = r2.size() > 0 ? r2.get(0) : Integer.MAX_VALUE;
            int b = r1.size() > 1 ? r1.get(0) + r1.get(1) : Integer.MAX_VALUE;
            sum -= Math.min(a, b);
        }
        return sum;
    }
}
