package Contest;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-27 20:22
 **/
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode p = head;
        ListNode tail = head;
        while (tail.next != null)
            tail = tail.next;
        ListNode prev = tail.next;
        while (prev != tail) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        return head;
    }
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
