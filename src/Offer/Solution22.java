package Offer;

import LinkList.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 22.链表中倒数第k个节点
 * @author: Yuner
 * @create: 2020-10-13 15:53
 **/
public class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head, pre = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }

        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }
}
