package Offer;

import LinkList.ListNode;

import java.util.List;

/**
 * @description: 24.反转链表
 * @author: Yuner
 * @create: 2020-10-13 16:05
 **/
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode nextnode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextnode;
        }
        return pre;
    }

}
