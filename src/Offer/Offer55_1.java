package Offer;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-03 15:35
 **/
public class Offer55_1 {
    public int maxDepth(TreeNode root){
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> queue = new LinkedList<>(){{add(root);}}, temp;
        int res = 0;
        while (!queue.isEmpty()) {
            temp = new LinkedList<>();
            for (TreeNode node : queue) {
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            queue = temp;
            res++;
        }
        return res;
    }
}
