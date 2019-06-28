/**
 * @author Dell
 * @create 2019-06-22 17:23
 */
//使用长度为 256 的整型数组来统计每个字符出现的个数，每个字符有偶数个可以用来
//构成回文字符串。
//因为回文字符串最中间的那个字符可以单独出现，所以如果有单独的字符就把它放到
//最中间。
public class Solution {
    public int longestPalindrome(String s) {
        int[] cnts = new int[256];

        char[] sArray = s.toCharArray();
        for (char c : sArray)
            cnts[c]++;

        int palindrome = 0;
        for (int cnt : cnts)
            palindrome += (cnt / 2) * 2;

        if (palindrome < s.length())
            palindrome++; // 这个条件下s中一定有单个未使用的字符存在，可以把这个字符放到回文的最中间

        return palindrome;
    }
}
