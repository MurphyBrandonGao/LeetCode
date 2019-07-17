/**
 * @author Dell
 * @create 2019-06-29 21:43
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0b01010101010101010101010101010101) != 0;
    }
}
