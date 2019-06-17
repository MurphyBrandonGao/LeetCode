/**
 * @author Dell
 * @create 2019-06-17 16:14
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);
        ListNode preMid = preMid(head);
        ListNode mid = preMid.next;
        preMid.next = null;
        TreeNode t = new TreeNode(mid.val);
        t.left = sortedListToBST(head);
        t.right = sortedListToBST(mid.next);
        return t;
    }

    private ListNode preMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre;
    }
}
