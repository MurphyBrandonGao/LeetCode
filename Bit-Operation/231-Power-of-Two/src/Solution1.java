/**
 * @author Dell
 * @create 2019-06-29 21:41
 */
public class Solution1 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}