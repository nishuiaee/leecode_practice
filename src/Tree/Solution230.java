package Tree;

import Common.TreeNode;

import java.util.Stack;

/**
 * @description: 230.二叉树中第K小的元素
 * @author: Yuner
 * @create: 2020-11-07 20:12
 **/
public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            if (--k == 0) return node.val;
            if (node.right != null) {
                cur = node.right;
            }
        }
        return 0;
    }
}
