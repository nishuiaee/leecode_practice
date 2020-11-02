package LinkList;


/**
 * @description: 24.两两交换链表中的节点
 * @author: Yuner
 * @create: 2020-10-27 11:02
 **/
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode(0);
        ListNode pre = hair;
        hair.next = head;

        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < 2; i++) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode next = tail.next;
            pre.next = tail;
            tail.next = head;
            head.next = next;
            pre = head;
            head = next;

        }
        return hair.next;
    }

}
