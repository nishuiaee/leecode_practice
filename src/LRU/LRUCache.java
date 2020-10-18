package LRU;

import java.util.HashMap;

/**
 * @description: 146.实现一个LRU队列
 * @author: Yuner
 * @create: 2020-10-18 15:24
 **/
public class LRUCache<K,V> {

    private Node head;
    private Node tail;
    private HashMap<K,Node> map;
    private int maxSize;


    private class Node {
        K key;
        V value;
        Node next;
        Node pre;

        public Node(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }

    public LRUCache(int capacity) {
        this.maxSize = capacity;
        map = new HashMap<>(capacity * 4 / 3);
        head = new Node(null,null);
        tail = new Node(null,null);

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

        Node node = new Node(key, value);
        map.put(key, node);
        appendHead(node);

        if (map.size() > maxSize) {
            Node node1 = removeTail();
            map.remove(node1.key);
        }
    }

    private void unlink(Node node) {
        Node pre = node.pre;
        Node next = node.next;

        next.pre = pre;
        pre.next = next;

        node.pre = null;
        node.next = null;
    }

    private void appendHead (Node node) {
        Node next = head.next;

        node.next = next;
        next.pre = node;

        head.next = node;
        node.pre = head;
    }

    private Node removeTail () {
        Node node = tail.pre;

        Node pre = node.pre;
        pre.next = tail;
        tail.pre = pre;

        node.next = null;
        node.pre = null;
        return node;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得关键字 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得关键字 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4

    }
}
