/**
 * @author Dell
 * @create 2019-03-25 17:45
 */
public class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums[0] < nums[nums.length - 1])
            return nums[0];

        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] < nums[h])
                h = mid;
            else
                l = mid + 1;
        }
        return nums[l];
    }
}
