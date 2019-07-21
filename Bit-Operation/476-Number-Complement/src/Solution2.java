/**
 * @author Dell
 * @create 2019-06-30 10:50
 */
public class Solution2 {
    public int findComplement(int num) {
        int mask = num;
        mask |= mask >> 1;
        mask |= mask >> 2;
        mask |= mask >> 4;
        mask |= mask >> 8;
        mask |= mask >> 16;
        return (mask ^ num);
    }
}
