import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 * @create 2019-07-19 20:09
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length())
            return new ArrayList<>();

        //申请一个数列，用于记录窗口中具体元素的个数情况
        //这里用数组的形式呈现，也可以考虑其他数据结构
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();

        int[] hash = new int[26];
        for (int i = 0; i < pArr.length; i++) {
            hash[pArr[i - 'a']]++;
        }

        //l表示左指针
        //count记录当前的条件，具体根据题目要求来定义
        //result用来存放结果
        List<Integer> result = new ArrayList<>();
        int l = 0;
        int count = 0;
        int pLength = p.length();
        for (int r = 0; r < sArr.length;r++) {
            // 更新新元素在散列表中的数量
            hash[sArr[r] - 'a']--;
            //根据窗口的变更结果来改变条件值
            if (hash[sArr[r] - 'a'] >= 0)
                count++;

            if (r > pLength - 1) {
                hash[sArr[l] - 'a']++;
                if (hash[sArr[l] - 'a'] > 0)
                    count--;

                l++;
            }
            //更新结果
            if (count == pLength)
                result.add(l);
        }
        return result;
    }
}
