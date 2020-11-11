package Contest.Contest11_11;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-11 10:20
 **/
public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B!=null) && (validate(A, B) || (isSubStructure(A.left, B)) || isSubStructure(A.right, B));
    }

    private boolean validate(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return validate(A.left, B.left) && validate(A.right, B.right);
    }
}
