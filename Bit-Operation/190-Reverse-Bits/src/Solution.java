/**
 * @author Dell
 * @create 2019-06-29 21:28
 */
public class Solution {
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret <<= 1;
            ret |= (n & 1);
            n >>>= 1;
        }
        return ret;
    }
}
