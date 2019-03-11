import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-03-11 23:23
 */
//快速排序：时间复杂度O（N），空间复杂度O（1）
public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int j = partition(nums, l, h);
            if (j == k)
                break;
            else if (j < k)
                l = j + 1;
            else
                h = j - 1;
        }

        return nums[k];
    }

    private int partition(int[] a, int l, int h) {
        int i = l;
        int j = h + 1;
        while (true) {
            while (a[++i] < a[l] && i < h);
            while (a[--j] > a[l] && j > l);
            if (i >= j)
                break;
            swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
