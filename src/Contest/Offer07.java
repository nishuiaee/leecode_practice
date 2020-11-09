package Contest;

import Common.TreeNode;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 15:03
 **/
public class Offer07 {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] po;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       po = preorder;
       for (int i = 0; i < inorder.length; i++) {
           map.put(inorder[i],i);
       }
       return recur(0,0, inorder.length - 1);
    }
    TreeNode recur(int pre_root, int in_left, int in_right) {
        if (in_left > in_right) return null;
        TreeNode root = new TreeNode(po[pre_root]);
        int i = map.get(po[pre_root]);
        root.left = recur(pre_root + 1, in_left, i - 1);
        root.right = recur(pre_root + i + 1 - in_left, i + 1, in_right);
        return root;
    }
}
