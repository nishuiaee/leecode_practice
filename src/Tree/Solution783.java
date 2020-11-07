package Tree;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-07 18:31
 **/
public class Solution783 {
    TreeNode pre = null;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if (root == null)
            return 0;
        minDiffInBST(root.left);
        if (pre != null) {
            min = Math.min(root.val - pre.val, min);
        }
        pre = root;
        minDiffInBST(root.right);
        return min;
    }
}
