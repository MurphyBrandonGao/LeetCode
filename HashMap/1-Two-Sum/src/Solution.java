import java.util.HashMap;

/**
 * @author Dell
 * @create 2019-06-21 22:38
 */
//可以先对数组进行排序，然后使用双指针方法或者二分查找方法。这样做的时间复杂度
//为 O(NlogN)，空间复杂度为 O(1)。
//用 HashMap 存储数组元素和索引的映射，在访问到 nums[i] 时，判断 HashMap
// 中是否存在 target - nums[i]，如果存在说明 target - nums[i] 所在的索引
// 和 i 就是要找的两个数。该方法的时间复杂度为 O(N)，空间复杂度为 O(N)，
// 使用空间来换取时间。
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexForNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexForNum.containsKey(target - nums[i]))
                return new int[] {indexForNum.get(target - nums[i]), i};
            else
                indexForNum.put(nums[i], i);
        }
        return null;
    }
}
