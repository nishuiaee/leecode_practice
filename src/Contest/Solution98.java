package Contest;

import Common.TreeNode;

import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-07 15:09
 **/
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            if (pre != null && pre.val >= cur.val) {
                return false;
            }
            pre = cur;
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return true;
    }
}
