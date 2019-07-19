/**
 * @author Dell
 * @create 2019-06-27 19:42
 */
// 使用z&(z-1)去除z位级表示最低的那一位
public class Solution1 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int cnt = 0;
        while (z != 0) {
            z &= (z - 1);
            cnt++;
        }
        return cnt;
    }
}
