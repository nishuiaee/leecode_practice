package Contest;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 16:27
 **/
public class Offer34 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }
    private void recur(TreeNode root, int sum) {
        if (root == null) return ;
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null)
            res.add(new LinkedList<>(path));
        recur(root.left, sum);
        recur(root.right, sum);
        path.removeLast();
    }
}
