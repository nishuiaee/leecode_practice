package Offer;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-03 10:41
 **/
public class Offer54 {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if (root == null) return ;
        dfs(root.right);
        if (k == 0) return ;
        if (--k == 0)res = root.val;
        dfs(root.left);
    }
}
