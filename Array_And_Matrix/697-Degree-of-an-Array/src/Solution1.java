import java.util.HashMap;
import java.util.Map;

/**
 * @author Dell
 * @create 2019-06-25 19:50
 */
public class Solution1 {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;

        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], new int[]{1, i, i});  // 数组中第一个元素为数组的度，第二个元素为该数第一次出现的下标，第三个数为最后一次出现的下标
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }

        int degree = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        for (int[] value : map.values()){
            if (value[0] > degree) {
                degree = value[0];
                res = value[2] - value[1] + 1;
            } else if (value[0] == degree) {
                res = Math.min(value[2] - value[1] + 1, res);
            }
        }
        return res;
    }
}
