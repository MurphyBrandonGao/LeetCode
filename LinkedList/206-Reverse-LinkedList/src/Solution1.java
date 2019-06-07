/**
 * @author Dell
 * @create 2019-06-07 9:48
 */
// 头插法
public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode newList = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList;
    }
}