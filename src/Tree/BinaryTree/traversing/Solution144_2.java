package Tree.BinaryTree.traversing;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 迭代二叉树前序遍历
 * @author: Yuner
 * @create: 2020-11-05 11:42
 **/
public class Solution144_2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new LinkedList<>(){{push(root);}};
        while ( !deque.isEmpty()) {
            TreeNode cur = deque.pop();
            res.add(root.val);
            if (cur.right != null) {
                deque.push(cur.right);
            }
            if (cur.left != null) {
                deque.push(cur.left);
            }
        }
        return res;
    }

}
