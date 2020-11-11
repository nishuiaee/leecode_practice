package A_PASS;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-11 10:21
 **/
public class Offer34 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res;
        path.add(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) res.add(new ArrayList<>(path));
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        path.removeLast();
        return res;
    }
}
