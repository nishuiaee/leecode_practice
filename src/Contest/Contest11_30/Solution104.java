package Contest.Contest11_30;

import Common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-30 20:34
 **/
public class Solution104 {
    int maxdepth;
    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return maxdepth;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            maxdepth = Math.max(depth, maxdepth);
            depth = 1;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
