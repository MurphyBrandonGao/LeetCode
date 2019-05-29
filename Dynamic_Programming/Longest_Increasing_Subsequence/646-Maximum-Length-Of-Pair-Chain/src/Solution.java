import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-05-28 18:54
 */
public class Solution {
    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length == 0)
            return 0;

        Arrays.sort(pairs, (a, b)->(a[0] - b[0]));
        int n = pairs.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[j][1] < pairs[i][0])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int res = 1;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
