/**
 * @author Dell
 * @create 2019-06-03 19:21
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int x = i < 0 ? 0 : num1.charAt(i--) - '0';
            int y = j < 0 ? 0 : num2.charAt(j--) - '0';
            sum = x + y + carry;
            stringBuilder.append(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0)
            stringBuilder.append(carry);
        return stringBuilder.reverse().toString();
    }
}
