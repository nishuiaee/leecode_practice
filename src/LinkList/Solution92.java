package LinkList;

/**
 * @description: 反转链表2 递归解法
 * @author: Yuner
 * @create: 2020-10-07 21:01
 **/
public class Solution92 {
    ListNode successor = null;
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseN(head,n);
        }
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }

    private ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
