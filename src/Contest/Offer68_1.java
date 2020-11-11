package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-10 20:03
 **/
public class Offer68_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val)
           return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
           return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    public TreeNode solution2(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null){
            if (root.val > p.val && root.val > q.val)
                root = root.left;
            else if (root.val < p.val && root.val < q.val)
                root = root.right;
            else
                break;
        }

        return root;
    }

}
