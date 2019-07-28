import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Dell
 * @create 2019-07-27 10:29
 */
public class Solution2 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 桶排序
        // 将频率作为数组下标，对于出现频率不同的数字集合，存入对应的数组下标
        int[] list = new int[nums.length + 1];
        for (Integer key : map.keySet()) {
            // 获取出现次数作为下标
            int i = map.get(key);

        }
        return res;
    }
}