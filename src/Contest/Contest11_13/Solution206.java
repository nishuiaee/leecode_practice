package Contest.Contest11_13;

import LinkList.ListNode;

import java.util.List;


/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-14 15:29
 **/
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    private ListNode solution(ListNode head) {
       if (head == null) return head;
        ListNode pre = null, cur = head;
       while (cur != null) {
           ListNode next = cur.next;
           cur.next = pre;
           pre = cur;
           cur = next;
       }
       return pre;
    }
}
