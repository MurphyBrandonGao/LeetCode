import java.util.HashMap;

/**
 * @author Dell
 * @create 2019-06-22 16:11
 */
public class Solution1 {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum : length of the sequence, n is in
                int sum = left + right + 1;
                map.put(n, sum);

                // keep track of the max length
                res = Math.max(res, sum);

                //extend the length to the boundary(s) of the sequence
                // will do nothing if n has no neighbors
                //map.put(n - left, sum);
                //map.put(n + right, sum);
            } else {
                continue;
            }
        }
        return res;
    }
}