/**
 * @author Dell
 * @create 2019-04-01 16:47
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0)
            return false;

        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (nums[mid] == target)
                return true;
            if (nums[mid] > nums[hi]) {
                if (nums[mid] > target && target >= nums[lo])
                    hi = mid;
                else
                    lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                if (nums[mid] < target && target <= nums[hi])
                    lo = mid + 1;
                else
                    hi = mid;
            } else
                hi--;
        }
        return nums[lo] == target ? true : false;
    }

    public static void main(String[] args) {
        int[] nums = {};
        boolean res = (new Solution()).search(nums, 0);
        System.out.println(res);
    }
}
