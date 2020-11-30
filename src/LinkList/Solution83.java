package LinkList;

/**
 * @description: 83.删除排序链表中的重复元素
 * @author: Yuner
 * @create: 2020-11-30 21:13
 **/
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while (quick != null) {
            if (slow.val != quick.val) {
                slow.next = quick;
                slow = slow.next;
            }
            quick = quick.next;
        }
        slow.next = null;
        return head;
    }
}
