package Tree.BinaryTree.traversing;

import Common.TreeNode;
import com.sun.source.tree.Tree;

import java.util.*;

/**
 * @description: 二叉树中序遍历
 * @author: Yuner
 * @create: 2020-11-05 12:36
 **/
public class Solution94 {
    List<Integer> list = new ArrayList<>();
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        return inorderTraversal(root.right);
    }

    //迭代
    public List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new LinkedList<>(){};
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            if (cur.right != null) {
                cur = cur.right;
            }
        }
        return res;
    }

    public List<Integer> solution3(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }

}
