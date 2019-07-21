/**
 * @author Dell
 * @create 2019-06-30 10:20
 */
// 对于00000101，要求补码可以将它与00000111进行异或操作，那么问题就转换为求
// 掩码00000111
public class Solution {
    public int findComplement(int num) {
        if (num == 0)
            return 1;

        int mask = 1 << 30;
        while ((mask & num) == 0)
            mask >>= 1;

        mask = (mask << 1) - 1;
        return num ^ mask;
    }
}
