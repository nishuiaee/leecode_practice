package Offer;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 32_2从上到下打印二叉树
 * @author: Yuner
 * @create: 2020-10-14 08:30
 **/
public class Offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return null;
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode treeNode = deque.poll();
                temp.add(treeNode.val);
                if (treeNode.left != null) deque.add(treeNode.left);
                if (treeNode.right != null) deque.add(treeNode.right);
            }
            lists.add(temp);
        }
        return lists;
    }
}
