import java.util.List;

/**
 * @author Dell
 * @create 2019-05-31 20:34
 */
//dict 中的单词没有使用次数的限制，因此这是一个完全背包问题。该问题涉及到字典中单词的使用顺序，
// 因此可理解为涉及顺序的完全背包问题。
//求解顺序的完全背包问题时，对物品的迭代应该放在最里层。
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                int len = word.length();
                if (len <= i && word.equals(s.substring(i - len, i)))
                    dp[i] = dp[i] || dp[i - len];
            }
        }
        return dp[n];
    }
}
