/**
 * @author Dell
 * @create 2019-06-23 16:20
 */
public class Solution {
    public void moveZeros(int[] nums) {
        int idx = 0;
        for (int num : nums)
            if (num != 0)
                nums[idx++] = num;

        while (idx < nums.length)
            nums[idx++] = 0;
    }
}
