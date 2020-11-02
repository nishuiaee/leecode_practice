package LinkList;

/**
 * @description: 25.K个一组翻转链表
 * @author: Yuner
 * @create: 2020-10-20 10:01
 **/
public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0);
        ListNode pre = hair;
        hair.next = head;

        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode next = tail.next;
            ListNode[] nodes = myReverse(head,tail);
            head = nodes[0];
            tail = nodes[1];
            pre.next = head;
            tail.next = next;
            head = tail.next;
            pre = tail;
        }
        return hair.next;
    }
    private ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        return new ListNode[]{tail,head};

    }
}
