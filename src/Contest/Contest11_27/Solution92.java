package Contest.Contest11_27;

import LinkList.ListNode;

import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-27 17:06
 **/
public class Solution92 {
    ListNode tail = null;
    public ListNode reverseBetween(ListNode head, int m, int n) {
         if (m == 1) {
             return reverseNode(head, n);
         }
         head.next = reverseBetween(head, --m, --n);
         return head;
    }

    private ListNode reverseNode (ListNode head, int n) {
        if (n == 1) {
            tail = head.next;
            return head;
        }
        ListNode last = reverseNode(head, n);
        head.next.next = head;
        head.next = null;
        return last;
    }


}
