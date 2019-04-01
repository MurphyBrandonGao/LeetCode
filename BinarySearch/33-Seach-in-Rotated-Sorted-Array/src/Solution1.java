/**
 * @author Dell
 * @create 2019-04-01 17:40
 */
public class Solution1 {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int m = l + ((h - l) >> 1);
            if (nums[m] > nums[h])
                l = m + 1;
            else
                h = m;
        }

        // lo==hi is the index of the smallest value and also the number of places rotated.
        int rot = l;
        l = 0;
        h = nums.length - 1;
        // The usual binary search and accounting for rotation.
        while(l <= h){
            int mid = l + ((h - l) >> 1);
            int realmid = (mid + rot) % nums.length;
            if(nums[realmid] == target)
                return realmid;
            if(nums[realmid] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return -1;
    }
}
