/**
 * @author Dell
 * @create 2019-06-25 18:18
 */
public class Solution {
    public int maxChunksToSorted(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int count = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            right = Math.max(right, arr[i]);
            if (right == i)
                count++;
        }
        return count;
    }
}
