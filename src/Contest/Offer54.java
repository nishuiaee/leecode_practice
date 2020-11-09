package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 21:14
 **/
public class Offer54 {
    public int kthLargest(TreeNode root, int k) {
        return dfs(root, k).val;
    }
    private TreeNode dfs(TreeNode root, int k) {
        if (root == null) return null;
        dfs(root.right, k);
        if (--k == 0) return root;
        dfs(root.left, k);
        return root;
    }
}
