package Contest.Contest12_1;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-01 19:35
 **/
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        ListNode pre = null;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
