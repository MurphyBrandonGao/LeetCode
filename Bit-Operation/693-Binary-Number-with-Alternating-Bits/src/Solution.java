/**
 * @author Dell
 * @create 2019-06-29 21:58
 */
public class Solution {
    public boolean hasAlternatingBits(int n) {
        int a = (n ^ (n >> 1));
        return (a & (a + 1)) == 0;
    }
}
