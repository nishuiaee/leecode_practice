package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 21:32
 **/
public class Offer55 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
       return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
