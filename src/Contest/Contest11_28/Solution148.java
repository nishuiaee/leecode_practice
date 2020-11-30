package Contest.Contest11_28;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-28 11:07
 **/
public class Solution148 {
    public ListNode sortList(ListNode head) {
       if (head == null || head.next == null) {
           return head;
       }
       ListNode slow = head, fast = head.next;
       while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
       }
       ListNode tmp = slow.next;
       slow.next = null;
       ListNode left = sortList(head);
       ListNode right = sortList(tmp);
       ListNode pre = new ListNode(0);
       ListNode cur = pre;
       while (left != null && right != null) {
           if (left.val < right.val) {
               cur.next = left;
               left = left.next;
           } else {
               cur.next = right;
               right = right.next;
           }
           cur = cur.next;
       }
       cur.next = left == null ? right : left;
       return pre.next;
    }

}
