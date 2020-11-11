package Contest.Contest11_11;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-11 10:22
 **/
public class Offer68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
