package Graph.DepthFirstSearch;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.List;

//104.二叉树的最大深度
public class Solution104 {


    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    public int solution2 (TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> list = new LinkedList<>(), temp;
        list.add(root);
        int res = 0;
        while (!list.isEmpty()) {
            temp = new LinkedList<>();
            for (TreeNode node : list) {
                temp.add(node);
            }
            list = temp;
            res++;
        }
        return res;
    }
}
