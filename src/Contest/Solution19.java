package Contest;

import LinkList.ListNode;

import java.util.LinkedList;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 11:03
 **/
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode head1 = new ListNode(0);
        head1.next = head;
        ListNode tail = head;
        ListNode first = head;
        ListNode pre = head1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            tail = tail.next;
            count++;
        }

        while (tail != null) {
            pre = pre.next;
            tail = tail.next;
            first = first.next;
            count++;
        }
        if (count == n) {
            return head.next;
        } else {
            pre.next = first.next;
            return head;
        }

    }
}
