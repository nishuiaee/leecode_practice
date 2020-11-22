package Contest.Contest11_22;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-22 15:57
 **/
public class LRU<K,V> {

    private Node head;
    private Node tail;
    private HashMap<K, Node> map;
    private int maxValue;

    class Node {
        K key;
        V value;
        Node pre;
        Node next;
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRU(int maxValue) {
        map = new HashMap<>(maxValue * 4 / 3);
        head = new Node(null, null);
        tail = new Node(null, null);
        head.next = tail;
        tail.pre = head;
    }

    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }
        Node node = map.get(key);
        unlink(node);
        appendHead(node);
        return node.value;
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            unlink(node);
        }

        Node node = new Node(key, value);
        map.put(key, node);

        appendHead(node);
        if (map.size() > maxValue) {
            Node node1 = removeTail();
            map.remove(node1.key);
        }
    }

    private void unlink(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
        node.next = null;
        node.pre = null;
    }

    private Node removeTail() {
        Node node = tail.pre;

        Node pre = node.pre;
        pre.next = tail;
        tail.pre = pre;

        node.next = null;
        node.pre = null;
        return node;
    }

    private void appendHead(Node node) {
        Node next = head.next;

        node.next = next;
        node.pre = head;

        head.next = node;
        next.pre = node;
    }
}
