package Contest.Contest11_27;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-27 16:58
 **/
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
        }
        return l1.val < l2.val ? l1 : l2;
    }

}
