package Review.day10_20;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-20 14:13
 **/
public class Solution146<K,V> {

    private Node head;
    private Node tail;
    private HashMap<K, Node> map;
    private int maxSize;

    private class Node {
        private K key;
        private V value;
        private Node next;
        private Node pre;

        public Node(K k,V v) {
            this.key = k;
            this.value = v;
        }
    }

    public Solution146(int capacity) {
        maxSize = capacity;
        map = new HashMap<>(capacity * 4 / 3);
        head = new Node(null,null);
        tail = new Node (null,null);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        unlink(node);
        appendHead(node);

        return (int)node.value;
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            unlink(node);
        }
        Node node = new Node(key,value);
        map.put(key,node);
        appendHead(node);

        if (map.size() > maxSize) {
            Node node1 = removeTail();
            map.remove(node1.key);
        }
    }

    private void unlink (Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
        node.next = null;
        node.pre = null;
    }

    private void appendHead (Node node) {
        Node next = head.next;

        node.next = next;
        next.pre = node;

        head.next = node;
        node.pre = head;
    }

    private Node removeTail() {
        Node node = tail.pre;
        Node pre = node.pre;

        pre.next = tail;
        tail.pre = pre;

        return node;
    }
}
