package Contest;

import Common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 15:34
 **/
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.left != null) deque.add(node.left);
            if (node.right != null) deque.add(node.right);
        }
        return root;
    }
}
