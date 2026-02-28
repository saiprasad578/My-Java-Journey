import java.util.*;

class problem5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int remainder = 0;

        for (int bit : nums) {
            remainder = (remainder * 2 + bit) % 5;
            result.add(remainder == 0);
        }

        return result;
    }
}