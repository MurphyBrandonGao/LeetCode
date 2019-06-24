import java.util.Stack;

/**
 * @author Dell
 * @create 2019-06-19 19:36
 */
// 在遍历数组时用栈把数组中的数存起来，如果当前遍历的数比栈顶元素来的大，
// 说明栈顶元素的下一个比它大的数就是当前元素。
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] dist = new int[n];
        Stack<Integer> indexs = new Stack<>();
        for (int curIndex = 0; curIndex < n; curIndex++) {
            while (!indexs.isEmpty() && T[curIndex] > T[indexs.peek()]) {
                int preIndex = indexs.pop();
                dist[preIndex] = curIndex - preIndex;
            }
            indexs.add(curIndex);
        }
        return dist;
    }
}
