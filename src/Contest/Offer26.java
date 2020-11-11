package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 15:15
 **/
public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (volidate(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }
    private boolean volidate (TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return volidate(A.left, B.left) && volidate(A.right, B.right);
    }

}
