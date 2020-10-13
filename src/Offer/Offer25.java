package Offer;

import LinkList.ListNode;

/**
 * @description: 25.合并两个排序的链表
 * @author: Yuner
 * @create: 2020-10-13 16:41
 **/
public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return pre.next;

    }
}
