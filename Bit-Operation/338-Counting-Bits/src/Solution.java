/**
 * @author Dell
 * @create 2019-06-30 9:11
 */
public class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ret[i] = ret[i & (i - 1)] + 1;
        }
        return ret;
    }
}
