package Practice_Tree;

import Common.TreeNode;
import jdk.jshell.spi.SPIResolutionException;

/**
 * @description: 验证搜索二叉树
 * @author: Yuner
 * @create: 2020-11-05 09:31
 **/
public class Practice1 {
    private long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if (!isValidBST(root.left))
            return false;
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isValidBST(root.right);
    }
}
