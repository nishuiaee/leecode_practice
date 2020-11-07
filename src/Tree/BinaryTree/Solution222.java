package Tree.BinaryTree;

import Common.TreeNode;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-06 13:28
 **/
public class Solution222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.right) + countNodes(root.left);
    }


    public int computeDepth(TreeNode node) {
        int count = 0;
        while (node.left != null)
        {
            count++;
            node = node.left;
        }
        return count;
    }


    public boolean exists(int idx, int d, TreeNode node) {
       int left = 0, right = (int)Math.pow(2,d) - 1;
       int pivot;
       for (int i = 0; i < d; ++i) {
           pivot = left + (right - left) / 2;
           if (idx <= pivot) {
               node = node.left;
               right = pivot;
           } else {
               node = node.right;
               left = pivot + 1;
           }
       }
       return node != null;
    }

    public int countNodes1(TreeNode root) {
       if (root == null) return 0;
       int d = computeDepth(root);
       if (d == 0) return 1;

       int left = 1, right = (int) Math.pow(2, d) - 1;
       int pivot;
       while (left <= right) {
           pivot = left + (right - left) / 2;
           if (exists(pivot, d, root)) left = pivot + 1;
           else right = pivot - 1;
       }
       return left + (int) Math.pow(2,d) - 1;
    }

}
