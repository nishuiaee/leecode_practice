package Tree.SerchTree;

import Common.TreeNode;

/**
 * @description: 98.验证二叉搜索树
 * @author: Yuner
 * @create: 2020-10-19 16:13
 **/
public class Solution98 {

    private long pre = Long.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        if (!isValidBST(root.left)) {
            return false;
        }

        if (pre >= root.val) {
            return false;
        }
        pre = root.val;

        return isValidBST(root.right);
    }


}
