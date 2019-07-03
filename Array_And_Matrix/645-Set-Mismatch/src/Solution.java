/**
 * @author Dell
 * @create 2019-06-24 18:54
 */
// 主要思想是通过交换数组元素，使得数组上的元素在正确位置上
// 时间复杂度为O(nlogn),空间复杂度为O(1)
public class Solution {
    public int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return new int[] {nums[i], i + 1};
        }
        return null;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
