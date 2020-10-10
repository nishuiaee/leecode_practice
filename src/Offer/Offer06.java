package Offer;

import LinkList.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 06.从尾到头打印链表
 * @author: Yuner
 * @create: 2020-10-10 10:49
 **/
public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        Deque<Integer> stack = new LinkedList<>();

        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        int size = stack.size();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = stack.pop();
        }

        return nums;
    }
}
