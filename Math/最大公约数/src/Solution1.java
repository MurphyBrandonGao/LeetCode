/**
 * @author Dell
 * @create 2019-06-02 16:40
 */
//编程之美：2.7 使用位操作和减法求解最大公约数
public class Solution1 {
    public int gcd(int a, int b) {
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a;

        boolean isAEven = isEven(a);
        boolean isBEven = isEven(b);
        if (isAEven && isBEven)
            return 2 * gcd(a >> 1, b >> 1);
        else if (isAEven && !isBEven)
            return gcd(a >> 1, b);
        else if (!isAEven && isBEven)
            return gcd(a, b >> 1);
        else
            return gcd(b, a - b);
    }

    private boolean isEven(int a) {
        if ((a & 1) == 1)
            return false;
        return true;
    }
}
