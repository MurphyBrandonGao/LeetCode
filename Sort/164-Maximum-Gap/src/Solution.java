/**
 * @author Dell
 * @create 2019-07-22 14:06
 */
public class Solution {

    private class Bucket {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // 分配桶的长度和个数是桶排序的关键
        // 在n个数下，形成的两辆相邻，形成的两两区间是n-1个，比如【2,4,6,8】这里
        // 有4个数，但是只有3个区间，
        // 因此，桶长度=区间总长度/区间总个数 =（max-min) / (nums.length - 1)
        int bucketSize = Math.max(1, (max - min) / nums.length - 1);

        // 桶个数=区间长度/桶长度 + 1
        // 已知一个元素，需要定位到桶的时候，一般是（当前元素-最小值）/ 桶长度
        Bucket[] buckets = new Bucket[(max - min) / bucketSize + 1];

        for (int i = 0; i < nums.length; i++) {
            int loc = (nums[i] - min) / bucketSize;
            if (buckets[loc] == null)
                buckets[loc] = new Bucket();
            buckets[loc].min = Math.min(buckets[loc].min, nums[i]);
            buckets[loc].max = Math.max(buckets[loc].max, nums[i]);
        }
        int previousMax = Integer.MAX_VALUE;
        int maxGap = Integer.MIN_VALUE;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null && previousMax != Integer.MAX_VALUE)
                maxGap = Math.max(maxGap, buckets[i].min - previousMax);

            if (buckets[i] != null) {
                previousMax = buckets[i].max;
                maxGap = Math.max(maxGap, buckets[i].max - buckets[i].min);
            }
        }
        return maxGap;
    }

}
