package Review;

import LinkList.ListNode;

/**
 * @description: 翻转链表
 * @author: Yuner
 * @create: 2020-10-20 10:09
 **/
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
