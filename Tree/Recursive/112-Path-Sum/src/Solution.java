/**
 * @author Dell
 * @create 2019-06-10 23:47
 */
// 判断树中从根节点到叶子节点是否有一条路径和为sum
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;

        if (root.right == null && root.right == null && root.val == sum)
            return true;

        return hasPathSum(root.right, sum - root.val) || hasPathSum(root.left, sum - root.val);
    }
}
