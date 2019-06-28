/**
 * @author Dell
 * @create 2019-06-22 17:14
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cnts = new int[26];

        char[] sArray = s.toCharArray();
        for (char c : sArray)
            cnts[c - 'a']++;

        char[] tArray = t.toCharArray();
        for (char c : tArray)
            cnts[c - 'a']--;

        for (int cnt : cnts)
            if (cnt != 0)
                return false;

        return true;
    }
}
