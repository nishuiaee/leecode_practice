package Contest;

import Common.Node;
import Common.TreeNode;

import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 20:00
 **/
public class Offer36 {
   Node pre,head;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    private void dfs(Node node) {
        if (node == null) return ;
        dfs(node.left);
        if (pre != null) pre.right = node;
        else head = node;
        node.left = pre;
        pre = node;

        dfs(node.right);
    }

    private Node solution2(Node root) {
        if (root == null) return null;
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node node = stack.pop();
            if (pre != null) pre.right = node;
            else head = node;
            node.left = pre;
            pre = node;
            if (node.right != null) {
                cur = node.right;
            }
        }
        pre.right = head;
        head.left = pre;
        return head;
    }
}
