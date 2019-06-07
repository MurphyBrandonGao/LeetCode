import java.util.Stack;

/**
 * @author Dell
 * @create 2019-06-07 12:41
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1Stack = buildStack(l1);
        Stack<Integer> l2Stack = buildStack(l2);
        int carry = 0;
        ListNode head = new ListNode(-1);
        while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || carry != 0) {
            int x = (l1Stack.isEmpty()) ? 0 : l1Stack.pop();
            int y = (l2Stack.isEmpty()) ? 0 : l2Stack.pop();
            int sum = (x + y + carry);
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            carry = sum / 10;
        }
        return head.next;
    }

    private Stack<Integer> buildStack(ListNode l1) {
        Stack<Integer> stack = new Stack<>();
        while (l1 != null) {
            stack.push(l1.val);
            l1 = l1.next;
        }
        return stack;
    }
}
