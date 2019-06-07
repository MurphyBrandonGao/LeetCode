/**
 * @author Dell
 * @create 2019-06-07 10:40
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
