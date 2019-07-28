import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.*;

/**
 * @author Dell
 * @create 2019-07-27 9:52
 */
// 方法一：最小堆法
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1) - map.get(o2);
            }
        });
        for (Integer key : map.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(key);
            } else if (map.get(key) > map.get(priorityQueue.peek())) {
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            list.add(priorityQueue.remove());
        }
        return list;
    }
}
