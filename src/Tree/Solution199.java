package Tree;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @description: 199.二叉树的右视图
 * @author: Yuner
 * @create: 2020-11-10 17:04
 **/
public class Solution199 {

    //广度优先遍历
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        LinkedList<TreeNode> lists = new LinkedList<>(), temp;
        lists.add(root);
        while (!lists.isEmpty()) {
            temp = new LinkedList<>();
            for (int i = 0; i < lists.size(); i++) {
                TreeNode node = lists.get(i);
                if (i == lists.size() - 1)
                    res.add(node.val);
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            lists = temp;
        }
        return res;
    }
    List<Integer> res = new LinkedList<>();
    //深度优先遍历
    public List<Integer> dfs(TreeNode root) {
       dfs(root, 0);
       return res;
    }
    private void dfs(TreeNode root, int depth) {
        if (root == null) return ;
        if (depth == res.size()) {
            res.add(root.val);
        }
        depth++;
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}
