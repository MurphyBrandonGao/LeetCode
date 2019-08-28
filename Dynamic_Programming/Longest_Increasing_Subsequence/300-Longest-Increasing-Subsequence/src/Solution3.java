import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-05-28 18:25
 */
//递归+记忆化搜索：时间复杂度为O（n^2)
public class Solution2 {
    private int[] memo;

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, getMaxLength(nums, i));
        }
        return res;
    }

    //以nums[index]为结尾的最长上升子序列的长度
    private int getMaxLength(int[] nums, int index) {
        if (memo[index] != -1)
            return memo[index];

        int res = 1;
        for (int i = 0; i < index; i++) {
            if (nums[index] > nums[i])
                res = Math.max(res, getMaxLength(nums, i) + 1);
        }
        memo[index] = res;
        return memo[index];
    }
}
