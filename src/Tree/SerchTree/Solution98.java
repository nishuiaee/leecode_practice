package Tree.SerchTree;

import Common.TreeNode;

import java.util.Deque;
import java.util.Stack;

/**
 * @description: 98.验证二叉搜索树
 * @author: Yuner
 * @create: 2020-10-19 16:13
 **/
public class Solution98 {

    private long pre = Long.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        if (!isValidBST(root.left)) {
            return false;
        }

        if (pre >= root.val) {
            return false;
        }
        pre = root.val;

        return isValidBST(root.right);
    }

    public boolean isValidBST1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (pre != null && cur.val <= pre.val)
                    return false;
                pre = cur;
                cur = cur.right;
            }
        }
        return true;
    }

}
