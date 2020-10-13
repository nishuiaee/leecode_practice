package Offer;

import Common.TreeNode;

/**
 * @description: 26.树的子结构
 * @author: Yuner
 * @create: 2020-10-13 17:02
 **/
public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }

    boolean recur (TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left,B.left) && recur(A.right,B.right);
    }

}
