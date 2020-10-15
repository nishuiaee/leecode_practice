package Offer;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 32_3从上到下打印二叉树3
 * @author: Yuner
 * @create: 2020-10-14 09:07
 **/
public class Offer32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new LinkedList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        boolean flag = true;
        deque.add(root);
        while (!deque.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList();
            for (int i = deque.size(); i > 0 ; i--) {
                TreeNode node = deque.poll();
                if (flag) {
                    temp.addLast(node.val);
                } else {
                    temp.addFirst(node.val);
                }
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }
            flag = !flag;
            res.add(temp);
        }
        return res;
    }
}
