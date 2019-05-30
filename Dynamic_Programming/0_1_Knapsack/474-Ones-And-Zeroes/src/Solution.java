/**
 * @author Dell
 * @create 2019-05-30 16:42
 */
//这是一个多维费用的 0-1 背包问题，有两个背包大小，0 的数量和 1 的数量。
public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        if (strs == null || strs.length == 0)
            return 0;

        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int zeros = 0;
            int ones = 0;
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '0')
                    zeros++;
                else
                    ones++;
            }
            for (int i = m; i >= zeros; i--)
                for (int j = n; j >= ones; j++)
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
        }

        return dp[m][n];
    }
}
