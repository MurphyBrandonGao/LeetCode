import java.util.*;

/**
 * @author Dell
 * @create 2019-06-13 22:58
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ret = new ArrayList<>();
        if (root == null)
            return ret;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            double sum = 0;
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            ret.add(sum / cnt);
        }
        return ret;
    }
}
