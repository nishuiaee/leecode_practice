package Tree;

import Common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 16:51
 **/
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
       HashMap<Integer,Integer> map = new HashMap();
       map.put(0, 1);
       return recur(root, map, sum, 0);
    }

    private int recur(TreeNode root, Map<Integer,Integer> map, int sum, int cur) {
       if (root == null) return 0;
       int res = 0;
       cur += root.val;
       res += map.getOrDefault(cur - sum, 0);
       map.put(cur, map.getOrDefault(cur, 0) + 1);

       res += recur(root.left, map, sum, cur);
       res += recur(root.right, map, sum, cur);
       map.put(cur, map.get(cur) - 1);
       return res;
    }
}
