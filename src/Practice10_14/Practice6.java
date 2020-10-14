package Practice10_14;


import Common.Node;

import java.util.HashMap;

/**
 * @description: 复制带随机指针的链表
 * @author: Yuner
 * @create: 2020-10-14 20:51
 **/
public class Practice6 {
    public HashMap<Node,Node> vistednode = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        if (vistednode.containsKey(head)) return vistednode.get(head);

        Node node = new Node(head.val);

        vistednode.put(head,node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;
    }
}
