/**
 * @author Dell
 * @create 2019-06-29 21:35
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
