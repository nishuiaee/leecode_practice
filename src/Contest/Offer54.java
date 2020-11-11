package Contest;

import Common.TreeNode;

import java.util.Stack;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 21:14
 **/
public class Offer54 {
    int count = 0, res = 0;
    public int kthLargest(TreeNode root, int k) {
        if (root == null) return res;
        kthLargest(root.right, k);
        count++;
        if (count == k) res = root.val;
        kthLargest(root.left, k);
        return res;
    }
    private int solution2 (TreeNode root, int k) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.right;
            }
            TreeNode node = stack.pop();
            if(--k == 0) res = node.val;
            if (node.left != null) {
                cur = node.left;
            }
        }
        return res;
    }
}
