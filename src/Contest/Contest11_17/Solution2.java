package Contest.Contest11_17;

import LinkList.ListNode;

import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-17 16:38
 **/
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;

            int sum = carry + n1 + n2;
            carry = sum / 10;
            sum = sum % 10;

            cur.next = new ListNode(sum);

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return head.next;
    }
}
