package Contest.Contest11_12;

import LinkList.ListNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 10:33
 **/
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        int[] nums = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            nums[i] = head.val;
            head = head.next;
        }
        return nums;
    }
}
