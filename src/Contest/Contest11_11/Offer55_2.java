package Contest.Contest11_11;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-11 10:22
 **/
public class Offer55_2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    private int dfs (TreeNode root) {
        if (root == null) return 0;
        return Math.max(dfs(root.left), dfs(root.right)) + 1;
    }

    private boolean solution(TreeNode root) {
        if (root == null) return true;
        return dfs2(root) == -1 ? false : true;
    }
    private int dfs2 (TreeNode root) {
        if (root == null) return 0;
        int left = dfs2(root.left);
        if (left == -1) return -1;
        int right = dfs2(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}
