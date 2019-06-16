import jdk.nashorn.internal.ir.IfNode;

/**
 * @author Dell
 * @create 2019-06-15 19:12
 */
//中序遍历解法
public class Solution {

    private int value;
    private int cnt;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return value;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null)
            return;

        inorder(node.left, k);
        cnt++;
        if (cnt == k) {
            value = node.val;
            return;
        }

        inorder(node.right, k);
    }
}
