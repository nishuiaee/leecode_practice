package Contest.Contest11_28;

import LinkList.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-28 12:54
 **/
public class Solution92_1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
         if (head == null) return null;
         ListNode pre = null, cur = head;
         while (m > 1) {
             pre = cur;
             cur = cur.next;
             m--;
             n--;
         }
         ListNode realpre = pre;
         ListNode realtail = cur;
         while (n > 0) {
             ListNode next = cur.next;
             cur.next = pre;
             pre = cur;
             cur = next;
             n--;
         }
         if (pre == null) {
             head = pre;
         } else {
             realpre.next = pre;
         }

         realtail.next = cur;
         return head;
    }

}
