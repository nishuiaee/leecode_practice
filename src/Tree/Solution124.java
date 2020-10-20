package Tree;

import Common.TreeNode;

/**
 * @description: 124.二叉树中的最大路径和
 * @author: Yuner
 * @create: 2020-10-19 16:03
 **/
public class Solution124 {
    private int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxValue;
    }

    public int dfs(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = Math.max(dfs(root.left),0);
        int right = Math.max(dfs(root.right),0);

        maxValue = Math.max(maxValue, left + right + root.val);

        return root.val + Math.max(left,right);
    }
}
