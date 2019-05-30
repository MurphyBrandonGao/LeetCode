/**
 * @author Dell
 * @create 2019-05-30 16:28
 */
//DFS解法
public class Solution1 {
    public int findTargetSumWays(int[] nums, int S) {
        return findTargetSumWays(nums, 0, S);
    }

    private int findTargetSumWays(int[] nums, int start, int S) {
        if (start == nums.length)
            return S == 0 ? 1 : 0;

        return findTargetSumWays(nums, start + 1, S + nums[start]) +
                findTargetSumWays(nums, start + 1, S - nums[start]);
    }
}
