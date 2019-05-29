import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 * @create 2019-05-27 10:19
 */
public class Solution {
    public int numSquares(int n) {
        List<Integer> squareList = generateSquareList(n);
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int square : squareList) {
                if (square > i)
                    break;
                min = Math.min(min, dp[i - square] + 1);
            }
            dp[i] = min;
        }

        return dp[n];
    }

    private List<Integer> generateSquareList(int n) {
        List<Integer> squareList = new ArrayList<>();
        int diff = 3;
        int square = 1;
        while (square <= n) {
            squareList.add(square);
            square += diff;
            diff += 2;
        }
        return squareList;
    }
}
