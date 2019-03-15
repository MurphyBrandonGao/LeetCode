import com.sun.javafx.collections.MappingChange;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dell
 * @create 2019-03-12 20:23
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums)
            frequencyForNum.put(num, frequencyForNum.getOrDefault(num, 0) + 1);

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key : frequencyForNum.keySet()) {
            int frequcency = frequencyForNum.get(key);
            if (buckets[frequcency] == null)
                buckets[frequcency] = new ArrayList<>();

            buckets[frequcency].add(key);
        }

    }
}
