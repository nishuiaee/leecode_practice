package Tree;

import Common.TreeNode;

/**
 * @description: 求根到叶子结点数字之和
 * @author: Yuner
 * @create: 2020-10-25 13:27
 **/
public class Solution129 {
    int res = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    private void dfs (TreeNode root, int cur) {
        if (root == null){
            return ;
        }
        cur = cur * 10 + root.val;

        if (root.left == null && root.right == null) {
            res += cur;
        }
        dfs(root.right, cur);
        dfs(root.left,cur);
    }
}
