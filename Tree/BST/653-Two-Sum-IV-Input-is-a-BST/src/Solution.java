import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 * @create 2019-06-17 16:47
 */
//使用中序遍历得到有序数组之后，再利用双指针对数组进行查找。
//应该注意到，这一题不能用分别在左右子树两部分来处理这种思想，
// 因为两个待求的节点可能分别在左右子树中。
public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        int i = 0;
        int j = nums.size() - 1;
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);
            if (sum == k)
                return true;
            if (sum > k)
                j--;
            else
                i++;
        }
        return false;
    }

    private void inorder(TreeNode root, List<Integer> nums) {
        if (root == null)
            return;

        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }
}
