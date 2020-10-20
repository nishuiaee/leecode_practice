package Contest;

import LinkList.ListNode;

/**
 * @description: 21.合并两个有序链表
 * @author: Yuner
 * @create: 2020-10-20 09:41
 **/
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
        {
            return l1 == null ? l2 : l1;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;

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
        return head.next;
    }
}
