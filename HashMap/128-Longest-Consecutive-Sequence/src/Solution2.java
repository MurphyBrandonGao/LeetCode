import java.util.HashSet;
import java.util.Set;

/**
 * @author Dell
 * @create 2019-06-22 16:35
 */
public class Solution2 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int res = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) { // num为最左端的值
                int m = num + 1;
                while (set.contains(m))
                    m++;

                res = Math.max(res, m);
            }
        }
        return res;
    }
}
