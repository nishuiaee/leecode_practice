package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-06 14:49
 **/
public class Practice1 {
    private long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
       if (root == null) return true;

       if (!isValidBST(root)) {
           return false;
       }

       if (pre >= root.val) {
           return false;
       }
       pre = root.val;

       return isValidBST(root.right);
    }
}
