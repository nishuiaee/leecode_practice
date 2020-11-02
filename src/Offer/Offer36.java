package Offer;

import Common.Node;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-01 17:47
 **/
public class Offer36 {
    class Node {
        public Node left;
        public Node right;
        public int var;
    }
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void dfs(Node cur) {
        if (cur == null) return ;
        dfs(cur.left);
        if (pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
