import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Dell
 * @create 2019-03-23 22:59
 */
public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] -o2[1];
            }
        });

        int cnt = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end)
                continue;

            cnt++;
            end = points[i][1];
        }
        return cnt;
    }
}
