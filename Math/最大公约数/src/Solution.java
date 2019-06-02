/**
 * @author Dell
 * @create 2019-06-02 16:39
 */
public class Solution {
    public int gcd(int a, int b) {
        return b == 0? a : gcd(b, a % b);
    }
}
