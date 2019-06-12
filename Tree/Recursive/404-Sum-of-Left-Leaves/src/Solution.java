/**
 * @author Dell
 * @create 2019-06-12 19:21
 */
public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        if (isLeaf(root.left))
            return root.left.val + sumOfLeftLeaves(root.right);

        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private boolean isLeaf(TreeNode treeNode) {
        if (treeNode == null)
            return false;

        return treeNode.left == null && treeNode.right == null;
    }
}
