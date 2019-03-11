import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-03-11 23:16
 */
//时间复杂度 O(NlogN)，空间复杂度 O(1)
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
