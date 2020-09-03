package Graph.DepthFirstSearch;

import Common.TreeNode;

//110.平衡二叉树
public class Solution110 {

    private int maxdepth;

    public boolean isBalanced(TreeNode root) {
        return true;
    }

    private void findmaxDepth(TreeNode root, int depth) {
        if(root != null) {
            if (root.left == null && root.right == null) {
                maxdepth = Math.max(maxdepth, depth);
                depth = 1;
            }
            findmaxDepth(root.left, depth + 1);
            findmaxDepth(root.right, depth + 1);
        }
    }
}
