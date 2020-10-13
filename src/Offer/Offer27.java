package Offer;

import Common.TreeNode;

/**
 * @description: 27.二叉树的镜像
 * @author: Yuner
 * @create: 2020-10-13 18:55
 **/
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;

    }


}
