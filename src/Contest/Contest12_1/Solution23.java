package Contest.Contest12_1;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-01 21:14
 **/
public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = l + (r - l) / 2;
        return merge(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    public ListNode merge(ListNode A, ListNode B) {
        if (A == null || B == null) {
            return A == null ? B : A;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (A != null && B != null) {
            if (A.val > B.val) {
                cur.next = B;
                B = B.next;
            } else {
                cur.next = A;
                A = A.next;
            }
            cur = cur.next;
        }
        cur.next = A == null ? B : A;
        return head.next;
    }
}
