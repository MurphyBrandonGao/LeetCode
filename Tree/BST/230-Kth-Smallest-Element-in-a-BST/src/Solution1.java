/**
 * @author Dell
 * @create 2019-06-15 19:24
 */
//递归解法
public class Solution1 {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);
        if (leftCount == k - 1)
            return root.val;
        if (leftCount > k - 1)
            return kthSmallest(root.left, k);
        return kthSmallest(root.right, k - leftCount - 1);
    }

    private int count(TreeNode node) {
        if (node == null)
            return 0;

        return 1 + count(node.left) + count(node.right);
    }
}