/**
 * @author Dell
 * @create 2019-07-19 21:30
 */
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        int[] hash = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            hash[s1Arr[i] - 'a']++;
        }
        int l = 0;
        int count = 0;
        for (int r = 0; r < s2Arr.length; ++r) {
            hash[s2Arr[r] - 'a']--;
            if (hash[s2Arr[r] - 'a'] >= 0)
                count++;

            if (r >= s1Arr.length) {
                hash[s2Arr[l] - 'a']++;
                if (hash[s2Arr[l] - 'a'] >= 1)
                    count--;

                l++;
            }
            if (count == s1Arr.length)
                return true;
        }
        return false;
    }
}
