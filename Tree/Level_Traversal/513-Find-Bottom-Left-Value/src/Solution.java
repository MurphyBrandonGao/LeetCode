import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dell
 * @create 2019-06-14 21:29
 */
public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null)
                queue.add(root.right);
            if (root.left != null)
                queue.add(root.left);
        }
        return root.val;
    }
}
