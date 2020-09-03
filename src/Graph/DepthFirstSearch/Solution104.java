package Graph.DepthFirstSearch;

import Common.TreeNode;

//104.二叉树的最大深度
public class Solution104 {

    private int maxdepth;

    public int maxDepth(TreeNode root) {
        findmaxDepth(root,1);
        return maxdepth;
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
