/**
 * @author Dell
 * @create 2019-06-23 15:10
 */
//记录一个字符上次出现的位置，如果两个字符串中的字符上次出现的位置一样，那么就
//属于同构
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (preIndexOfS[sc] != preIndexOfT[tc])
                return false;
            preIndexOfS[sc] = i + 1;
            preIndexOfT[tc] = i + 1;
        }
        return true;
    }
}
