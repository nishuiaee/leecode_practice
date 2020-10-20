package LinkList;

import java.util.LinkedList;

/**
 * @description: K组链表排序
 * @author: Yuner
 * @create: 2020-10-09 21:26
 **/
public class Solution23 {

    //分治法
    public ListNode mergeKLists1 (ListNode[] lists) {
        return mergeKLists2(lists, 0, lists.length - 1);
    }

    private ListNode mergeKLists2 (ListNode[] lists, int l , int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;

        return mergeTwoLists(mergeKLists2(lists,l,mid),mergeKLists2(lists, mid + 1, r));
    }

    // 循环合并
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode cur = null;
        for (int i = 1; i < lists.length; i++) {
            mergeTwoLists(cur,lists[i]);
        }
        return cur;
    }

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
