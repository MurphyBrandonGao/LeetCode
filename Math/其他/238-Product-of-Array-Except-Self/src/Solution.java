import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-06-05 20:31
 */
//给定一个数组，创建一个新数组，新数组的每个元素为原始数组中除了该位置上的元素之外所有元素的乘积。
//要求时间复杂度为 O(N)，并且不能使用除法
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        Arrays.fill(product, 1);
        int left = 1;
        for (int i = 1; i < n; i++) {
            left *= nums[i - 1];
            product[i] *= left;
        }
        int right = 1;
        for (int i = n - 2; i >= 0; i--) {
            right *= nums[i + 1];
            product[i] *= right;
        }
        return product;
    }
}
