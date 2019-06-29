/**
 * @author Dell
 * @create 2019-06-23 16:05
 */
public class Solution {
    public int countBinarySubstrings(String s) {
        int preLen = 0;
        int curLen = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curLen++;
            } else {
                preLen = curLen;
                curLen = 1;
            }

            if (preLen >= curLen)
                count++;
        }
        return count;
    }
}
