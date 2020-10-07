package LinkList;

import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @description: 445.两数相加
 * @author: Yuner
 * @create: 2020-10-07 19:50
 **/
public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> queue1 = new LinkedList<>();
        Deque<Integer> queue2 = new LinkedList<>();

        while (l1 != null) {
            queue1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            queue2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = new ListNode(0);
        int carry = 0;
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            int n1 = queue1.isEmpty() ? 0 : queue1.pop();
            int n2 = queue2.isEmpty() ? 0 : queue2.pop();

            int sum = carry + n1 + n2;
            carry = sum / 10;
            sum = sum % 10;

            ListNode cur = new ListNode(sum);
            cur.next = head.next;
            head.next = cur;

        }

        if (carry == 1) {
            ListNode cur = new ListNode(carry);
            cur.next = head.next;
            head.next = cur;
        }
        return head.next;
    }
}
