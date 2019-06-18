/**
 * @author Dell
 * @create 2019-06-15 19:38
 */
//逆序的中序遍历，即按非降序的排列
public class Solution {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        traver(root);
        return root;
    }

    private void traver(TreeNode node) {
        if (node == null)
            return;

        traver(node.right);
        sum += node.val;
        node.val = sum;
        traver(node.left);
    }
}
