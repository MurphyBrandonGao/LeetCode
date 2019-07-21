/**
 * @author Dell
 * @create 2019-06-30 10:46
 */
// 可以利用java的Integer.hightestOneBit()方法来获得含有首1的数
public class Solution1 {
    public int findComplement(int num) {
        if (num == 0)
            return 1;

        int mask = Integer.highestOneBit(num);
        mask = (mask << 1) - 1;
        return num ^ mask;
    }
}
