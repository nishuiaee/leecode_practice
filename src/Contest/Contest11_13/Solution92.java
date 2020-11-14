package Contest.Contest11_13;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-14 15:33
 **/
public class Solution92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return head;
        ListNode cur = head, pre = null;
        while (m > 1){
            pre = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode con = pre, tail = cur;
        while (n > 0) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            n--;
        }

        if (con != null) {
            con.next = pre;
        } else {
            head = pre;
        }
        tail.next = cur;
        return head;
    }



}
