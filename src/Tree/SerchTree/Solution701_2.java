package Tree.SerchTree;

import Common.TreeNode;

/**
 * @description: 迭代解法，向二叉搜索树中插入一个节点
 * @author: Yuner
 * @create: 2020-11-05 10:35
 **/
public class Solution701_2 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) return node;
        TreeNode cur = root;
        while (true) {
            if (cur.val > val) {
                if (cur.left != null) {
                    cur = cur.left;
                    continue;
                }
                cur.left = node;
                break;
            }
            if (cur.val < val) {
                if (cur.right != null) {
                    cur = cur.right;
                    continue;
                }
                cur.right = node;
                break;
            }
        }
        return root;
    }
}
