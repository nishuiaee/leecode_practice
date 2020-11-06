package Tree.SerchTree;

import Common.TreeNode;

/**
 * @description: 二叉搜索树中插入一个节点,递归解法
 * @author: Yuner
 * @create: 2020-11-05 10:18
 **/
public class Solution701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val > val) {
            root.left = insertIntoBST(root.left,val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
