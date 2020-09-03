package Graph.DepthFirstSearch;

import Common.TreeNode;

//101。对称二叉树
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        TreeNode newroot = root;
        return newisSymetric(root,newroot);

    }

    private boolean newisSymetric(TreeNode root,TreeNode newroot) {
        if(newroot == null && root == null) {
            return true;
        } else if (root == null || newroot == null){
            return false;
        } else if (root.val != newroot.val) {
            return false;
        } else {
            return newisSymetric(root.left,newroot.right) && newisSymetric(root.right,newroot.left);
        }
    }
}
