package Contest.Contest11_30;

import Common.TreeNode;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-30 19:50
 **/
public class Solution105 {
    int[] po;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        po = preorder;
        return recur(0, 0, inorder.length - 1);
    }

    private TreeNode recur(int pre_root, int in_left, int in_right) {
        if (in_left < in_right) {
            return null;
        }
        int i = map.get(po[pre_root]);
        TreeNode root = new TreeNode(po[pre_root]);
        root.left = recur(pre_root + 1, in_left, i - 1);
        root.right = recur(i + 1 - in_left + pre_root, i + 1, in_right);
        return root;
    }
}
