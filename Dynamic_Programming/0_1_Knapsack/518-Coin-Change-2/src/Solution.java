/**
 * @author Dell
 * @create 2019-05-31 19:19
 */
//完全背包问题，使用dp记录可达成目标的组合数目
public class Solution {
    public int change(int amount, int[] coins) {
        if (amount == 0 || coins == null || coins.length == 0)
            return 0;

        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
