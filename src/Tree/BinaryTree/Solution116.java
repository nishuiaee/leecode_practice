package Tree.BinaryTree;

import Common.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-05 15:49
 **/
class Solution116 {
    public Node connect(Node root) {
        if (root == null) return root;
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            for (int i = deque.size(); i > 0 ; i--) {
                Node node = deque.poll();

                if (i > 1) {
                    node.next = deque.peek();
                }
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }

        }
        return root;
    }

    public Node connect1(Node root) {
        if (root == null) {
            return root;
        }
        Node leftmost = root;
        while (leftmost.left != null) {
            Node head = leftmost;
            while (head != null) {
                head.left.next = head.right;
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }
}

