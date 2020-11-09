package Contest;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 15:34
 **/
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return root;
    }
}
