import java.util.Stack;

/**
 * @author Dell
 * @create 2019-06-18 20:21
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                boolean b1 = c == ')' && pop != '(';
                boolean b2 = c == ']' && pop != '[';
                boolean b3 = c == '}' && pop != '{';
                if (b1 || b2 || b3)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
