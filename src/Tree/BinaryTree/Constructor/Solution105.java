package Tree.BinaryTree.Constructor;

import Common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-05 16:45
 **/
public class Solution105 {
    private Map<Integer,Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left,
                                int preorder_right, int inorder_left, int inorder_right){
        if (preorder_left > preorder_right){
            return null;
        }
        int preorder_root = preorder_left;
        int inorder_root = indexMap.get(preorder[preorder_root]);
        TreeNode root = new TreeNode(preorder[preorder_root]);
        int size_left_subtree = inorder_root - inorder_left;
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n-1);
    }
}
