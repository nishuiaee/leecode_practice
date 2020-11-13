package Contest.Contest11_12;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 16:44
 **/
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode nextnode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextnode;
        }
        return cur;
    }
}
