/**
 * @author Dell
 * @create 2019-03-09 16:32
 */
public class Solution {
    public boolean validPalindrome(String s) {
        int i = -1;
        int j = s.length();
        while (++i < --j) {
            if (s.charAt(i) != s.charAt(j))
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}
