/**
 * @author Dell
 * @create 2019-06-26 20:07
 */
//要求不能修改数组，也不能使用额外空间
// 二分查找法
public class Solution {
    public int findDuplicate(int[] nums) {
        int l = 1;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int cnt = 0;
            for (int i = 0; i < nums.length; i++)
                if (nums[i] <= mid)
                    cnt++;

            if (cnt > mid)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }
}
