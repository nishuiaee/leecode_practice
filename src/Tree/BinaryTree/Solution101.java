package Tree.BinaryTree;

import Common.TreeNode;

import java.util.Stack;

/**
 * @description: 101对称二叉树
 * @author: Yuner
 * @create: 2020-11-30 20:56
 **/
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return validate(root.left, root.right);
    }

    private boolean validate(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null || A.val != B.val) return false;
        return validate(A.left, B.right) && validate(A.right, B.left);
    }

    private boolean solution1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (left == null && right == null) continue;
            if (left == null || right == null || left.val != right.val) return false;
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
}
