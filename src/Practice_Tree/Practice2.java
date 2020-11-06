package Practice_Tree;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-05 09:43
 **/
public class Practice2 {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    private int dfs (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(dfs(root.left),0);
        int right = Math.max(dfs(root.right), 0);
        max = Math.max(max, root.val + left + right);
        return root.val + Math.max(left, right);
    }
}
