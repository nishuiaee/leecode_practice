package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 16:42
 **/
public class Solution112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return recur(root, sum);
    }

    public boolean recur(TreeNode root, int tar) {
        if (root == null) return false;
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null)
            return true;
        return recur(root.left, tar) || recur(root.right, tar);
    }
}
