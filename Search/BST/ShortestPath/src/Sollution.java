import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dell
 * @create 2019-08-28 19:17
 */
public class Sollution {
    public int minPathLength(int[][] grids, int tr, int tc) {
        final int[][] direction = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        final int m = grids.length, n = grids[0].length;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(0, 0));
        int pathLength = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            pathLength++;
            while (size-- > 0) {
                Pair<Integer, Integer> cur = queue.poll();
                Integer cr = cur.getKey();
                Integer cc = cur.getValue();
                grids[cr][cc] = 0; // 标记为已经到达过
                for (int[] d : direction) {
                    int nr = cr + d[0];
                    int nc = cc + d[1];
                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                        continue;

                    if (nr == tr && nc == tc)
                        return pathLength;
                }
            }
        }
        return -1;
    }
}
