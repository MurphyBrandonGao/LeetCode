/**
 * @author Dell
 * @create 2019-05-29 16:06
 */
// 空间优化 dp[j] = max(dp[j], dp[j - w] + v)
public class Solution1 {
    public int knapsack(int W, int N, int[] weights, int[] values) {
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i - 1];
            int v = values[i - 1];
            for (int j = W; j >= w ; j--) {
                dp[j] = Math.max(dp[j], dp[j- w] + v);
            }
        }
        return dp[W];
    }
}
