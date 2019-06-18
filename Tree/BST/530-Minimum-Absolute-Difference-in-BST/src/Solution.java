/**
 * @author Dell
 * @create 2019-06-17 17:03
 */
//利用二叉查找树的中序遍历为有序的性质，计算中序遍历中临近的两个节点之差的绝对值，
// 取最小值
public class Solution {

    private int minDiff = Integer.MAX_VALUE;
    TreeNode preNode = null;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;

        inOrder(node.left);
        if (preNode != null)
            minDiff = Math.min(minDiff, node.val - preNode.val);
        preNode = node;

        inOrder(node.right);
    }
}
