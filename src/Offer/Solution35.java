package Offer;

import Common.Node;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-01 17:00
 **/
public class Solution35 {
    HashMap<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null) return null;
        if (map.containsKey(head)) {
            return map.get(head);
        }

        Node node = new Node(head.val);
        map.put(head, node);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        return node;
    }
    //不使用迭代
    public Node copyRandomList1(Node head) {
        if (head == null) {
            return null;
        }
        Node p = head;
        while (p != null) {
            Node newNode = new Node(p.val);
            newNode.next = p.next;
            p.next = newNode;
            p = newNode.next;
        }
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        Node dummy = new Node(-1);
        p = head;
        Node cur = dummy;
        while (p != null) {
            cur.next = p.next;
            cur = cur.next;
            p.next = cur.next;
            p = p.next;
        }
        return dummy.next;
    }
}
