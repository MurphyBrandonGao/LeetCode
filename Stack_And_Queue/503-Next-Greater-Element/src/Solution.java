import java.util.Arrays;
import java.util.Stack;

/**
 * @author Dell
 * @create 2019-06-19 20:04
 */
//与 739. Daily Temperatures (Medium) 不同的是，数组是循环数组，
// 并且最后要求的不是距离而是下一个元素。
public class Solution {
    public int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> pre = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!pre.isEmpty() && num > nums[pre.peek()]) {
                next[pre.pop()] = num;
            }
            if (i < n)
                pre.push(i);
        }
        return next;
    }
}
