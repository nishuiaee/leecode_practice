package Tree.SerchTree;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-05 10:44
 **/
public class Solution700_2 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        while (true) {
            if (root == null) {
                return null;
            }
            if (root.val == val)
                return root;
            if (root.val > val) {
                root = root.left;
                continue;
            }
            if (root.val < val) {
                root = root.right;
                continue;
            }
        }
    }
}
