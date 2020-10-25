package Tree;

import Common.TreeNode;
import numSum.Solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-25 13:35
 **/
public class Solution257 {
    List<String> paths = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        dfs (root,new StringBuilder());

        return paths;
    }

    private void dfs(TreeNode root, StringBuilder str) {
        if (root == null)
            return ;

        if (root.left == null && root.right == null) {
            paths.add(str.append(root.val).toString());
            return ;
        }

        dfs(root.left,str.append(root.val).append("->"));
        dfs(root.right,str.append(root.val).append("->"));
    }

}
