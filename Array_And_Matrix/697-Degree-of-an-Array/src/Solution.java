import java.util.HashMap;
import java.util.Map;

/**
 * @author Dell
 * @create 2019-06-25 19:32
 */
public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> numsCnt = new HashMap<>(); // 记录每个数出现次数
        Map<Integer, Integer> numsLastIndex = new HashMap<>(); // 记录每个数最后一次出现的下标
        Map<Integer, Integer> numsFirstIndex = new HashMap<>(); // 记录每个数第一次出现的下标
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numsCnt.put(num, numsCnt.getOrDefault(num, 0) + 1);
            numsLastIndex.put(num, i);
            if (!numsFirstIndex.containsKey(num))
                numsFirstIndex.put(num, i);
        }

        //寻找数组的度
        int maxCnt = 0;
        for (int num : nums)
            maxCnt = Math.max(maxCnt, numsCnt.get(num));

        int ret = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int cnt = numsCnt.get(num);
            if (cnt != maxCnt)
                continue;
            ret = Math.min(ret, numsLastIndex.get(num) - numsFirstIndex.get(num) + 1);
        }
        return ret;
    }
}
