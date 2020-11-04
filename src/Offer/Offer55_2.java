package Offer;

import Common.TreeNode;

/**
 * @description: 平衡二叉树
 * @author: Yuner
 * @create: 2020-11-03 16:44
 **/
public class Offer55_2 {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }
    private int recur (TreeNode root) {
        int left = recur(root.left);
        if (left == -1) return -1;
        int right = recur(root.right);
        if (right == -1) return -1;
        return Math.abs(right - left) > 1 ? -1 : Math.max(left,right) + 1;
    }
}
