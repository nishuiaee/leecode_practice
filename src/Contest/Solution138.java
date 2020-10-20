package Contest;

import Common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 138.复制带随机指针的链表
 * @author: Yuner
 * @create: 2020-10-20 14:04
 **/
public class Solution138 {
    Map<Node,Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {


        if (head == null) {
            return null;
        }

        if (map.containsKey(head)) {
            return map.get(head);
        }

        Node node = new Node(head.val);
        map.put(head, node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;
    }
}
