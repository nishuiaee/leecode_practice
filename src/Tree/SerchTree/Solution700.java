package Tree.SerchTree;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-05 10:14
 **/
public class Solution700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        return null;
    }
}
