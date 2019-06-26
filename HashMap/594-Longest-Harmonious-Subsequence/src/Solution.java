import java.util.HashMap;
import java.util.Map;

/**
 * @author Dell
 * @create 2019-06-22 0:36
 */
//和谐序列中最大数和最小数之差正好为1，应该注意的是序列的元素不一定是数组的连续元素
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> countForNum = new HashMap<>();
        for (int num : nums)
            countForNum.put(num, countForNum.getOrDefault(num, 0) + 1);

        int longest = 0;
        for (int num : countForNum.keySet())
            if (countForNum.containsKey(num + 1))
                longest = Math.max(longest, countForNum.get(num + 1) + countForNum.get(num));

        return longest;
    }
}
