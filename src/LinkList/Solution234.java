package LinkList;

/**
 * @description: 回文链表
 * @author: Yuner
 * @create: 2020-11-13 15:18
 **/
public class Solution234 {
    ListNode left;
    //递归，时间空间复杂度O(n）
    public boolean isPalindrome(ListNode head) {
        left = head;
        return traverse(head);
    }
    private boolean traverse(ListNode right) {
        if (right == null) {
            return true;
        }
        boolean res = traverse(right.next);
        res = res && (right.val == left.val);
        left = left.next;
        return res;
    }

    //迭代，时间空间复杂度O(1)
    private boolean solution2(ListNode head) {
        ListNode slow, fast;
        slow = head;
        fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null)
            slow = slow.next;
        ListNode left = head;
        ListNode right = reverse(slow);

        while (right != null) {
            if (left.val != right.val)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    ListNode reverse(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
