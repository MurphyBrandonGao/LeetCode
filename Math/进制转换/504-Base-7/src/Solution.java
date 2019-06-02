/**
 * @author Dell
 * @create 2019-06-02 15:51
 */
public class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";

        StringBuilder stringBuilder = new StringBuilder();
        boolean isNegative = num < 0;
        if (isNegative)
            num = -num;
        while (num > 0) {
            stringBuilder.append(num % 7);
            num /= 7;
        }
        String ret = stringBuilder.reverse().toString();
        return isNegative ? "-" + ret : ret;
    }
}
