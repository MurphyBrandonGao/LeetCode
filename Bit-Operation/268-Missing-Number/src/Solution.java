/**
 * @author Dell
 * @create 2019-06-27 19:57
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ i ^ nums[i];
        }
        return ret ^ nums.length;
    }
}
