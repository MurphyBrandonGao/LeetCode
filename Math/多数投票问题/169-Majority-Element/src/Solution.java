import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-06-05 19:58
 */
//先对数组排序，最中间那个数出现次数一定多于 n / 2。
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
