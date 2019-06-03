/**
 * @author Dell
 * @create 2019-06-03 18:59
 */
public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0 && a.charAt(i--) == '1')
                carry++;
            if (j >= 0 && b.charAt(j--) == '1')
                carry++;
            stringBuilder.append(carry % 2);
            carry /= 2;
        }
        if (carry == 1)
            stringBuilder.append(carry);
        return stringBuilder.reverse().toString();
    }
}
