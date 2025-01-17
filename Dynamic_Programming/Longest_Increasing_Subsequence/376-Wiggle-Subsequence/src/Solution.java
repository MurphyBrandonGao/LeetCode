/**
 * @author Dell
 * @create 2019-05-29 14:13
 */
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int up = 1;
        int down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return Math.max(up, down);
    }
}
