import javax.xml.stream.events.Characters;

/**
 * @author Dell
 * @create 2019-07-19 20:59
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        char[] sArr = s.toCharArray();
        int[] hash = new int[256];
        int l = 0;
        int result = 1;
        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]]++;
            while (hash[sArr[r]] != 1) {
                hash[sArr[l]]--;
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
