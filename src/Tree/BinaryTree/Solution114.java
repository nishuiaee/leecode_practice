package Tree.BinaryTree;

import Common.TreeNode;

import java.sql.ClientInfoStatus;
import java.util.*;

/**
 * @description: 将二叉树展开为链表
 * @author: Yuner
 * @create: 2020-11-05 14:42
 **/
public class Solution114 {
    //迭代
    public void flatten1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<TreeNode> res = new LinkedList<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                res.add(node);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        int size = res.size();
        for (int i = 1; i < size; i++) {
            TreeNode prev = res.get(i - 1), curr = res.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

    public void flatten(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        preorderTraversal(root, res);
        int size = res.size();
        for (int i = 1; i < size; i++ ) {
            TreeNode prev = res.get(i - 1), cur = res.get(i);
            prev.left = null;
            prev.right = cur;
        }

    }
    public void preorderTraversal(TreeNode root, List<TreeNode> res) {
        if (root != null) {
            res.add(root);
            preorderTraversal(root.left, res);
            preorderTraversal(root.right, res);
        }
    }
}
