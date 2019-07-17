/**
 * @author Dell
 * @create 2019-06-29 21:49
 */
public class Solution1 {
    public boolean isPowerOfFour(int num) {
        return Integer.toString(num, 4).matches("10*");
    }
}
