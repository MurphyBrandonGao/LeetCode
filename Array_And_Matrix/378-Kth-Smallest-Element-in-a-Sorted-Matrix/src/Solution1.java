import java.util.PriorityQueue;

/**
 * @author Dell
 * @create 2019-06-24 18:44
 */
// 堆解法
public class Solution1 {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        PriorityQueue<Tuple> priorityQueue = new PriorityQueue<Tuple>();
        for (int j = 0; j < n; j++)
            priorityQueue.offer(new Tuple(0, j, matrix[0][j]));

    }

    private class Tuple implements Comparable<Tuple> {
        int x;
        int y;
        int val;

        public Tuple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Tuple that) {
            return this.val - that.val;
        }
    }
}
