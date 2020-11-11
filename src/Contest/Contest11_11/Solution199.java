package Contest.Contest11_11;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-11 11:40
 **/
public class Solution199 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
       dfs(root, 1);
       return res;
    }
    private void dfs (TreeNode root, int depth) {
        if (root == null) return ;
        if (depth > res.size())
            res.add(root.val);
        depth++;
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}
