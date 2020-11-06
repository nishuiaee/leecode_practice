package Tree.SerchTree;

import Common.TreeNode;

/**
 * @description: 删除二叉树搜索树的节点
 * @author: Yuner
 * @create: 2020-11-05 11:08
 **/
public class Solution702 {
    public TreeNode deleteNode (TreeNode root, int key) {
        if (root == null)
            return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            TreeNode maxNode = findMax(root.left);
            root.val = maxNode.val;
            root.left = deleteNode(root.left,root.val);
        }
        return root;
    }
    private TreeNode findMax(TreeNode node) {
        while (node.right != null)
            node = node.right;
        return node;
    }
}
