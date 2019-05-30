/**
 * @author Dell
 * @create 2019-05-30 17:03
 */
//物品：硬币
//物品大小：面值
//物品价值：数量
//因为硬币可以重复使用，因此这是一个完全背包问题。完全背包只需要将 0-1
// 背包中逆序遍历 dp 数组改为正序遍历即可。
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount == 0)
            return 0;

        int[] dp = new int[amount + 1];
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (i == coin)
                    dp[i] = 1;
                else if (dp[i] == 0 && dp[i - coin] != 0)
                    dp[i] = dp[i - coin];
                else if (dp[i - coin] != 0)
                    dp[i] = Math.min(dp[i], dp[i - coin]);
            }
        }
        return dp[amount] == 0? -1 : dp[amount];
    }
}
