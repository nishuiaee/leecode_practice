package Offer;

import Common.TreeNode;

/**
 * @description: 28.对称的二叉树
 * @author: Yuner
 * @create: 2020-10-13 19:06
 **/
public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : judgement(root.left,root.right);
    }
    boolean judgement (TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return judgement(L.left,R.right) && judgement(L.right,R.left);
    }
}
