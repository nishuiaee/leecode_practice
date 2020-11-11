package Offer;

import Common.TreeNode;

import java.util.Deque;
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
       if (root == null)
           return 0;
       Deque<TreeNode> deque = new LinkedList<>();
       int res = 0;
       deque.offer(root);
       while (!deque.isEmpty()) {
           Deque<TreeNode> temp = new LinkedList<>();
           for (int i = deque.size(); i > 0; i--) {
               TreeNode node = deque.poll();
               if (node.left != null) temp.add(node.left);
               if (node.right != null) temp.add(node.right);
           }
           res++;
           deque = temp;
       }
       return res;
    }
}
