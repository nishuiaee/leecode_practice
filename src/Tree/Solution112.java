package Tree;

import Common.TreeNode;

/**
 * @description: 路径总和
 * @author: Yuner
 * @create: 2020-10-25 12:54
 **/
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
