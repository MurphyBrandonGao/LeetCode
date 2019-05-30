/**
 * @author Dell
 * @create 2019-05-30 15:57
 */
//该问题可以转换为 Subset Sum 问题，从而使用 0-1 背包的方法来求解。
//
//可以将这组数看成两部分，P 和 N，其中 P 使用正号，N 使用负号，有以下推导：
//
//                  sum(P) - sum(N) = target
//sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
//                       2 * sum(P) = target + sum(nums)
//因此只要找到一个子集，令它们都取正号，并且和等于 (target + sum(nums))/2，就证明存在解。
public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = computeArraySum(nums);
        if (sum < S || (sum + S) % 2 == 1)
            return 0;

        int W = (sum + S) / 2;
        int[] dp = new int[W + 1];
        for (int num : nums) {
            for (int i = W; i >= num; i--) {
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[W];
    }

    private int computeArraySum(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        return sum;
    }
}
