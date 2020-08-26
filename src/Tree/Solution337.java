package Tree;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//337.打家劫舍
public class Solution337 {
    private Map<TreeNode,Integer> f = new HashMap<>();
    private Map<TreeNode,Integer> g = new HashMap<>();

    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(f.getOrDefault(root,0), g.getOrDefault(root, 0));
    }

    public void dfs(TreeNode node) {
        if(node != null){
            dfs(node.left);
            dfs(node.right);
            f.put(node,node.val + g.getOrDefault(node.left,0) + g.getOrDefault(node.right,0));
            g.put(node,Math.max(f.getOrDefault(node.left, 0), g.getOrDefault(node.left,0) + Math.max(f.getOrDefault(node.right, 0), g.getOrDefault(node.right, 0))));
        }
    }
}
