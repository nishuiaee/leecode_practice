package Contest;

import Common.TreeNode;

import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 15:46
 **/
//两种解法
public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return validate(root.left, root.right);
    }
    private boolean validate(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null || A.val != B.val) return false;
        return validate(A.left,B.right) && validate(A.right, B.left);
    }

    public boolean solution2(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();
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
