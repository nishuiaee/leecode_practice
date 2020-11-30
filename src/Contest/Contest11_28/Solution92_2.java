package Contest.Contest11_28;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-28 13:28
 **/
public class Solution92_2 {
    ListNode temp = null;
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverse(head, n);
        }
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }

    ListNode reverse(ListNode head, int n) {
        if (n == 1) {
            temp = head.next;
            return head;
        }
        ListNode last = reverse(head.next, n - 1);
        head.next.next = head;
        head.next = temp;
        return head;
    }
}
