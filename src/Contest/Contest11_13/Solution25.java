package Contest.Contest11_13;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-14 16:07
 **/
public class Solution25 {

    //递归解法
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode a = head, b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) return head;
            b = b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }

    //迭代解法
    public ListNode solution1(ListNode head, int k) {

        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;
        while (head != null) {
            ListNode a = head, b = head;
            for (int i = 0; i < k; i++) {
                if (b == null) return hair.next;
                b = b.next;
            }
            pre.next = reverse(a, b);
            a.next = b;
            pre = a;
            head = b;
        }
        return hair.next;
    }

    //反转从a到b，左闭右开
    private ListNode reverse(ListNode a, ListNode b) {
        ListNode cur = a, pre = null;
        while (cur != b) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
