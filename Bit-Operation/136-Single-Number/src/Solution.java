/**
 * @author Dell
 * @create 2019-06-27 19:50
 */
// 两个相同的数异或的结果为0，对所有数进行异或操作，最后的结果就是单独出现的那个数
public class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int n : nums)
            ret = ret ^ n;

        return ret;
    }
}
