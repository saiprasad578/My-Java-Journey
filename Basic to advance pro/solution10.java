import java.util.List;
import java.util.ArrayList;

class solution10 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int mod = 0;
        for (int b : nums) {
            mod = ((mod << 1) + b) % 5;
            ans.add(mod == 0);
        }
        return ans;
    }
}