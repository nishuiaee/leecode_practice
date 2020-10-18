package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 删除链表的倒数第N个节点
 * @author: Yuner
 * @create: 2020-10-18 16:00
 **/
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        int count = 0;
        while(p != null){
            list.add(p);
            p = p.next;
            count++;
        }
        if(count == 1 && n == 1)
            return null;

        if(count - n == 0)
            head = list.get(1);
        else if(count - n == count - 1)
            list.get(count - n - 1).next = null;
        else
            list.get(count - n - 1).next = list.get(count - n + 1);
        return head;
    }
}
