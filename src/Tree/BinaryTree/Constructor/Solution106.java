package Tree.BinaryTree.Constructor;

import Common.TreeNode;

import java.util.HashMap;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-30 20:07
 **/
public class Solution106 {
    int[] po;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        po = postorder;
        return recur(0, inorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode recur(int in_l, int in_r, int po_l, int po_r) {
        if (in_l > in_r || po_l > po_r) {
            return null;
        }
        TreeNode root = new TreeNode(po[po_r]);
        int i = map.get(po[po_r]);
        root.left = recur(in_l, i - 1, po_l, po_l + i - in_l - 1);
        root.right = recur(i + 1, in_r, po_l + i - in_l, po_r - 1);
        return root;
    }
}
