package Contest.Contest11_14;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-15 10:09
 **/
public class Solution234 {
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return traverse(head);
    }
    private boolean traverse (ListNode right) {
        if (right == null) {
            return true;
        }
        boolean res = traverse(right.next);
        res = res && left.val == right.val;
        left = left.next;
        return res;
    }

    public boolean solution2(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }
        ListNode left = head;
        ListNode right = reverse(slow);
        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    private ListNode reverse(ListNode head) {
        ListNode cur = head, pre = null;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
