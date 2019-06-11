/**
 * @author Dell
 * @create 2019-06-09 13:43
 */
public class Solution {

    private int max = 0;

    public int diameterOfBinary(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        max = Math.max(max, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
