package Contest;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 16:05
 **/
public class Offer32_1 {
    public int[] levelOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return new int[]{};
        Deque<TreeNode> deque = new LinkedList<>(){{add(root);}};
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            res.add(node.val);
            if (node.left != null) deque.add(node.left);
            if (node.right != null) deque.add(node.right);
        }
        int[] nums = new int[res.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res.get(i);
        }
        return nums;
    }
}
