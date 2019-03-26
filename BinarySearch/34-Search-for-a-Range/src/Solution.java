/**
 * @author Dell
 * @create 2019-03-26 19:38
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target);
        int last = binarySearch(nums, target + 1) -1;
        if (first == nums.length || nums[first] != target)
            return new int[]{-1, -1};
        else
            return new int[]{first, Math.max(first, last)};
    }

    private int binarySearch(int[] nums, int target) {
        int l = 0;
        int h = nums.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] >= target)
                h = mid;
            else
                l = mid + 1;
        }

        return l;
    }
}
