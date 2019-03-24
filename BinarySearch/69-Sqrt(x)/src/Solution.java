/**
 * @author Dell
 * @create 2019-03-24 17:03
 */
public class Solution {
    public int mySqrt(int x) {
        if (x <= 1)
            return x;

        int l = 1;
        int h = x;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid)
                return mid;
            else if (mid > sqrt)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return h;
    }
}
