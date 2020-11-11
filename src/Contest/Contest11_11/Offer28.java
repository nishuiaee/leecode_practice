package Contest.Contest11_11;

import Common.TreeNode;

import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-11 10:21
 **/
public class Offer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode A, TreeNode B) {
        if (A == null && B == null) return true;
        if (A == null || B == null || A.val != B.val) return false;
        return dfs(A.left, B.right) && dfs(A.right, B.left);
    }

    private boolean solution2 (TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (left == null && right == null) continue;
            if (left == null || right == null ||right.val != left.val)
                return false;
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
}
