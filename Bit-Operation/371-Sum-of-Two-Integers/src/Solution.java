/**
 * @author Dell
 * @create 2019-06-30 9:36
 */
public class Solution {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum((a ^ b), (a & b) << 1);
    }
}
