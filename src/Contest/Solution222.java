package Contest;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-07 20:59
 **/
public class Solution222 {

    private int high(TreeNode root) {
        int count = 0;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    public boolean exists(int idx, int d, TreeNode node) {
        int left = 0, right = (int)Math.pow(2, d) - 1;
        int vot;
        for (int i = 0; i < d; i++) {
            vot = left + (right - left) >> 1;
            if (idx <= vot) node = node.left;
            else node = node.right;
        }
        return node != null;
    }
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int high = high(root);
        if (high == 0) return 1;

        int left = 1, right = (int)Math.pow(2, high) - 1;
        int vot = 0;
        while (left <= right) {
            vot = left + (right - left) >> 1;
            if (!exists(vot,high,root)) right = vot - 1;
            else left = vot + 1;
        }
        return (int)Math.pow(2,high) + left;
    }
}
