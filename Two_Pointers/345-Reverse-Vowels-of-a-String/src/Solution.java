import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Dell
 * @create 2019-03-09 16:13
 */
public class Solution {
    private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci))
                result[i++] = ci;
            else if (!vowels.contains(cj))
                result[j--] = cj;
            else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }
}
