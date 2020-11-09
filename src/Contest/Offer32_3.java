package Contest;

import Common.TreeNode;

import java.util.*;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 16:20
 **/
public class Offer32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        boolean flag = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (flag) {
                    list.add(node.val);
                }
                else list.addFirst(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }
}
