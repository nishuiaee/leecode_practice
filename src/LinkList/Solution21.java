package LinkList;

/**
 * @description: 21.合并两个有序链表
 * @author: Yuner
 * @create: 2020-10-20 09:29
 **/
public class Solution21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null || l2 == null)
        {
            return l1 == null ? l2 : l1;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head, Ln1 = l1 , Ln2 = l2;

        while (Ln1 != null && Ln2 != null) {
            if (Ln1.val > Ln2.val) {
                cur.next = Ln2;
                Ln2 = Ln2.next;
            } else {
                cur.next = Ln1;
                Ln1 = Ln1.next;
            }
            cur = cur.next;
        }

        cur.next = Ln1 == null ? Ln2 : Ln1;

        return head.next;
    }
}
