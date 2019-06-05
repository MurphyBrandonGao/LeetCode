import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-06-04 21:16
 */
public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int move = 0;
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            move += nums[h] - nums[l];
            l++;
            h--;
        }
        return move;
    }
}
