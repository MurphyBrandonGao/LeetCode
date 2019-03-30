/**
 * @author Dell
 * @create 2019-03-30 15:15
 */
public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[left] == target)
                return left;
            else if (nums[right] == target)
                return right;
            else {
                if (target > nums[mid]) {
                    if (nums[mid] > nums[0])
                        left = mid + 1;
                    else if (target > nums[0])
                        right = mid -1;
                    else
                        left = mid + 1;
                }
                else if (nums[mid] > nums[0]) {
                    if (target < nums[0])
                        left = mid + 1;
                    else
                        right = mid - 1;
                }
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
