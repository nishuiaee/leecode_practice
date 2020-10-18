package LRU;


import javax.print.attribute.standard.NumberOfDocuments;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @description: LRU（最近最久未使用）算法实现
 * @author: Yuner
 * @create: 2020-10-18 13:46
 **/
public class LRU<K, V> {

    private Node head;
    private Node tail;
    private HashMap<K,Node> map;
    private int maxValue;

    private class Node {
        K key;
        V value;
        Node pre;
        Node next;
        public Node(K k,V v) {
            this.key = k;
            this.value = v;
        }
    }

    public LRU(int maxValue){
        this.maxValue = maxValue;
        map = new HashMap<>(maxValue * 4 /3);
        head = new Node(null,null);
        tail = new Node(null,null);
        head.next = tail;
        tail.pre = head;
    }

    public void put(K key, V value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            unlink(node);
        }

        Node node = new Node(key, value);
        map.put(key, node);
        appendHead(node);

        if(map.size() > maxValue) {
            Node toRemove = removeTail();
            map.remove(toRemove.key);
        }
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

    private void unlink(Node node) {
        Node pre = node.pre;
        Node next = node.next;

        pre.next = next;
        next.pre = pre;

        node.next = null;
        node.pre = null;
    }

    private void appendHead(Node node) {
        Node next = head.next;
        node.next = next;
        next.pre = node;
        head.next = node;
        node.pre = head;
    }

    private Node removeTail() {
        Node node = tail.pre;

        Node pre = node.pre;
        tail.pre = pre;
        pre.next = tail;

        node.pre = null;
        node.next = null;

        return node;
    }

    public static void main(String[] args) {
        LRU lru = new LRU<>(2);

        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);

        System.out.println(lru.get(1));


        System.out.println(lru.get(2));
        System.out.println(lru.get(3));

    }

}
