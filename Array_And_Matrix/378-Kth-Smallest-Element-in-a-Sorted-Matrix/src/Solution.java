/**
 * @author Dell
 * @create 2019-06-24 17:24
 */
//二分搜索法
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m - 1][n - 1];
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n && matrix[i][j] <= mid; j++) {
                    cnt++;
                }
            }
            if (cnt < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
