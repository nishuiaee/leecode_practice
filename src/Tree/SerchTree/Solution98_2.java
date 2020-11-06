package Tree.SerchTree;

import Common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:迭代法
 * @author: Yuner
 * @create: 2020-11-05 11:21
 **/
public class Solution98_2 {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !deque.isEmpty()) {
            if (cur != null) {
                deque.push(cur);
                cur = cur.left;
            } else {
                cur = deque.pop();
                if (pre != null && cur.val <= pre.val)
                    return false;
                pre = cur;
                cur = cur.right;
            }
        }
        return true;
    }
}
