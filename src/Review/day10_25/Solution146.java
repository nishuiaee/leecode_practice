package Review.day10_25;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 10:29
 **/
public class Solution146 {

    private Node head;
    private Node tail;
    private HashMap<Integer, Node> hashMap;
    private int maxSize;

    class Node {
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
        private Node pre;
        private Node next;
        private int val;
        private int key;
    }

    public Solution146(int capacity) {
        maxSize = capacity;
        hashMap = new HashMap<>(capacity * 4 / 3);
        head = new Node(0, 0);
        tail = new Node(0 ,0);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            unlink(node);
            appendHead(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            unlink(node);
        }
        Node node = new Node(key,value);
        hashMap.put(key,node);
        appendHead(node);
        if (hashMap.size() > maxSize){

            Node node1 = removeTail();
            hashMap.remove(node1.key);
        }
    }

    public void unlink (Node node) {
        Node pre = node.pre;
        Node next = node.next;

        pre.next = next;
        next.pre = pre;

        node.next = null;
        node.pre = null;
    }

    public void appendHead (Node node) {
        Node next = head.next;
        next.pre = node;
        node.next = next;
        node.pre = head;
        head.next = node;
    }

    public Node removeTail () {
        Node node = tail.pre;
        Node pre = tail.pre.pre;
        pre.next = tail;
        tail.pre = pre;

        node.pre = null;
        node.next = null;
        return node;
    }
    public static void main(String[] args) {
        Solution146 lru = new Solution146(2);

        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);

        System.out.println(lru.get(1));


        System.out.println(lru.get(2));
        System.out.println(lru.get(3));

    }
}
