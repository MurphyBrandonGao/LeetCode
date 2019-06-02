/**
 * @author Dell
 * @create 2019-06-02 16:24
 */
public class Solution {
    public String toHex(int num) {
        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0)
            return "0";
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            stringBuilder.append(map[num & 0b1111]);
            num >>>= 4; // 因为考虑的是补码形式，因此符号位就不能有特殊的意义，需要使用无符号右移，左边填 0
        }
        return stringBuilder.reverse().toString();
    }
}
