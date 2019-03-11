import java.util.PriorityQueue;

/**
 * @author Dell
 * @create 2019-03-11 23:18
 */
//堆排序：时间复杂度O（NlogK),空间复杂度O（K）
public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();//小顶堆
        for (int val : nums) {
            pq.add(val);
            if (pq.size() > k) //维护堆的大小为k
                pq.poll();
        }
        return pq.peek();
    }
}
