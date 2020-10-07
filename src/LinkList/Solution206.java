package LinkList;

/**
 * @description: 206.反转链表
 * @author: Yuner
 * @create: 2020-10-07 20:31
 **/
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tempNode = cur.next;
            cur.next = prev;
            prev = cur;
        }
        return prev;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
