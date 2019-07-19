/**
 * @author Dell
 * @create 2019-06-27 19:39
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            if ((z & 1) == 1)
                cnt++;

            z = z >> 1;
        }
        return cnt;
    }
}
