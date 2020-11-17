package Contest.Contest11_17;

import LinkList.ListNode;

import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-17 16:52
 **/
public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
        }
        while (l2 != null) {
            stack2.push(l2.val);
        }

        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int n1 = stack1.isEmpty() ? 0 : stack1.pop();
            int n2 = stack2.isEmpty() ? 0 : stack2.pop();

            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);

            cur = cur.next;
        }

        if (carry == 1) {
            cur.next = new ListNode(1);
        }

        return head.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
