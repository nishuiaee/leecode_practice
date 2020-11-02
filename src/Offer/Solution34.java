package Offer;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-29 22:15
 **/
public class Solution34 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        return res;
    }
    void recur(TreeNode root, int tar){
        if (root == null) return;
        path.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null)
            res.add(new LinkedList<>(path));
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }

}
