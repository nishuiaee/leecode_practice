package LinkList;

/**
 * @description:反转链表迭代法
 * @author: Yuner
 * @create: 2020-11-14 13:56
 **/
public class Solution92_2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null)
            return null;
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode con = prev, tail = cur;

        while (n > 0) {
           ListNode next = cur.next;
           cur.next = prev;
           prev = cur;
           cur = next;
           n--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}
