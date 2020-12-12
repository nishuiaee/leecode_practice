package Contest.Contest12_3;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-12-03 16:00
 **/
public class LRU {

    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    int maxSize;

    class Node {
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }

    public LRU(int size) {
        this.maxSize = size;
        map = new HashMap<>(maxSize * 4 / 3);
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
    }

    private void put(int k, int v) {
        if (map.containsKey(k)) {
            Node node = map.get(k);
            unlink(node);
        }
        Node node = new Node(k, v);
        map.put(k, node);
        appendHead(node);

        if (map.size() > maxSize) {
            Node node1 = removeTail();
            map.remove(node1.key);
        }
    }

    private int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);

        unlink(node);
        appendHead(node);
        return node.value;
    }

    public void unlink(Node node) {
        Node next = node.next;
        Node pre = node.pre;

        pre.next = next;
        next.pre = pre;

        node.next = null;
        node.pre = null;
    }

    private void appendHead(Node node) {
        Node next = head.next;
        next.pre = node;
        node.next = next;

        head.next = node;
        node.pre = head;
    }

    private Node removeTail() {
        Node node = tail.pre;
        Node pre = tail.pre.pre;
        pre.next = tail;
        tail.pre = pre;

        node.next = null;
        node.pre = null;
        return node;
    }
}
