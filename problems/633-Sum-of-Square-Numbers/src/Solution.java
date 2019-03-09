/**
 * @author Dell
 * @create 2019-03-05 21:46
 */
public class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                j--;
            } else
                i++;
        }

        return false;
    }
}
