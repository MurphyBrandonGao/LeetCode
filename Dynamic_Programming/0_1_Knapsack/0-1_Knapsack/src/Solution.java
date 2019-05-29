/**
 * @author Dell
 * @create 2019-05-29 15:15
 */
public class Solution {
    public int knapsack(int W, int N, int[] weights, int[] values) {
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 1; i <= N; i++) {
            int weight = weights[i - 1];
            int value = values[i - 1];
            for (int j = 1; j <= W; j++) {
                if (weight < j)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[N][W];
    }
}
