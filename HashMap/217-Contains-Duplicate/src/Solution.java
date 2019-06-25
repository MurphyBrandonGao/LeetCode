import java.util.HashSet;
import java.util.Set;

/**
 * @author Dell
 * @create 2019-06-22 0:32
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        return set.size() < nums.length;
    }
}
