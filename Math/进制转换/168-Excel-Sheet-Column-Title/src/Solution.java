/**
 * @author Dell
 * @create 2019-06-03 18:27
 */
//因为是从 1 开始计算的，而不是从 0 开始，因此需要对 n 执行 -1 操作。
public class Solution {
    public String convertToTitle(int n) {
        if (n == 0)
            return "";

        n--;
        return convertToTitle(n / 26) + (char) (n % 26 + 'A');
    }
}
