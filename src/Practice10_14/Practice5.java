package Practice10_14;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 二叉树层序遍历
 * @author: Yuner
 * @create: 2020-10-14 20:43
 **/
public class Practice5 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = deque.poll();
                list.add(node.val);
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }
            res.add(list);
        }
        return res;
    }

}
