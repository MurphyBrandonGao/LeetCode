import java.util.Arrays;

/**
 * @author Dell
 * @create 2019-05-28 18:25
 */
// 二分查找，时间复杂度为O(nlogn)
public class Solution3 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] tails = new int[n];
        int len = 0;
        for (int num : nums) {
            int index = binarySearch(tails, len, num);
            tails[index] = num;
            if (index == len)
                len++;
        }
        return len;
    }

    private int binarySearch(int[] tails, int len, int key) {
        int l = 0;
        int h = len;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (tails[mid] == key)
                return mid;
            else if (tails[mid] > key)
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
