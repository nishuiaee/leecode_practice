package Tree;

import Common.Node;

import java.util.Stack;

/**
 * @description: 将二叉树转化为排序的双向链表
 * @author: Yuner
 * @create: 2020-11-09 20:08
 **/
public class Solution426 {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    private void dfs(Node cur) {
        if (cur == null) return;
        dfs(cur.left);
        if (pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
    public Node solution2(Node root) {
        if (root == null) return null;
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            Node node1 = stack.pop();
            if (pre != null) pre.right = node1;
            else head = node1;
            node1.left = pre;
            pre = node1;
            if (node1.right != null) {
                node = node1.right;
            }
        }
        return root;
    }
}
