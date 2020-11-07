package Tree.BinaryTree;

import Common.TreeNode;

import java.util.LinkedList;

/**
 * @description: 297.二叉树的序列化与反序列化 递归方式
 * @author: Yuner
 * @create: 2020-11-06 10:14
 **/
public class Solution297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#").append(",");
            return;
        }
        sb.append(root.val).append(",");

        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s : data.split(",")){
            nodes.addLast(s);
        }
        return deserialize(nodes);
    }
    private TreeNode deserialize(LinkedList<String> nodes) {
        if (nodes.isEmpty()) return null;

        String first = nodes.removeFirst();
        if (first.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(first));

        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }
}
