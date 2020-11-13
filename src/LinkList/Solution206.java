package LinkList;

/**
 * @description: 206.反转链表
 * @author: Yuner
 * @create: 2020-10-07 20:31
 **/
public class Solution206 {
    //迭代
    public ListNode reverseList1(ListNode head) {
       ListNode pre = null, cur = head;
       while (cur != null) {
          ListNode next = cur.next;
          cur.next = pre;
          pre = cur;
          cur = next;
      }
       return pre;
    }
    //递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
