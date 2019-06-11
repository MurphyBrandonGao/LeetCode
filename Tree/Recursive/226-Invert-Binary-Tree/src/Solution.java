import sun.reflect.generics.tree.Tree;

/**
 * @author Dell
 * @create 2019-06-10 23:25
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
}
