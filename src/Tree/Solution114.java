package Tree;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//114.将二叉树转为链表
public class Solution114 {

    public void TranverseTree(TreeNode root, TreeNode newroot) {
        if(root != null) {
            newroot.right = root;
            TranverseTree(root.left,newroot);
            TranverseTree(root.right,newroot);
        }
    }
    public void flatten(TreeNode root) {
        TreeNode newroot = new TreeNode();
        newroot = root;
        TreeNode newroot1 = new TreeNode();
        newroot1 = newroot;

        TranverseTree(root,newroot1);
        root = newroot;
    }
}
