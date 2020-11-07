package Tree.BinaryTree;

import Common.TreeNode;

/**
 * @description: 236.二叉树的最近公共祖先
 * @author: Yuner
 * @create: 2020-11-06 13:16
 **/
public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
