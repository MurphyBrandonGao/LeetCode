/**
 * @author Dell
 * @create 2019-06-11 20:29
 */
public class Solution {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return false;

        return isSubtreeWithRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSubtreeWithRoot(TreeNode s, TreeNode t) {
        if (s == null && t == null) // 都为空时直接返回true
            return true;
        if (s == null || t == null) // 只有其中一个为空时直接返回false
            return false;
        if (s.val != t.val) // 都不为空时比较两个节点的值是否相等
            return false;

        return isSubtreeWithRoot(s.left, t.left) && isSubtreeWithRoot(s.right, t.right);
    }
}
