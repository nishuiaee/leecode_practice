package Offer;

import LinkList.ListNode;

/**
 * @description: 18.删除链表的节点
 * @author: Yuner
 * @create: 2020-10-13 15:08
 **/
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while (cur != null) {
            if (cur.val == val) {
               pre.next = cur.next;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return head;
    }
}
