import java.util.*;

/**
 * @author Dell
 * @create 2019-06-14 22:17
 */
public class Solution {
    /*public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null)
                continue;
            ret.add(node.val);
            stack.push(node.right); // 先右后左
            stack.push(node.left);
        }
        return ret;
    }*/

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                result.add(node.val);
                stack.push(node.right);
                node = node.left;
            } else {
                node = stack.pop();
            }
        }
        return result;
    }
}
