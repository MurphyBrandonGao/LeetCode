/**
 * @author Dell
 * @create 2019-06-15 19:02
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;

        if (root.val > R)
            return trimBST(root.left, L, R);
        if (root.val < L)
            return trimBST(root.right, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
