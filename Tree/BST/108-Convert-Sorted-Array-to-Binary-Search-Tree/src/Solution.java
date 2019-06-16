/**
 * @author Dell
 * @create 2019-06-16 20:21
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int sIdx, int eIdx) {
        if (sIdx > eIdx)
            return null;
        int mid = sIdx + ((eIdx - sIdx) >> 1);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, sIdx, mid - 1);
        root.right = toBST(nums, mid + 1, eIdx);
        return root;
    }
}
