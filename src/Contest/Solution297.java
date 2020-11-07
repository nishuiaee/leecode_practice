package Contest;

import Common.TreeNode;

import java.util.LinkedList;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-07 21:42
 **/
public class Solution297 {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer str = new StringBuffer();
        return build(root,str);
    }

    public String build (TreeNode root,StringBuffer str) {
        if (root == null) {
            str.append("null").append(",");
        }
        str.append(root.val).append(",");
        serialize(root.left);
        serialize(root.right);
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> list = new LinkedList<>();
        for (String s : data.split(",")) {
            list.add(s);
        }
        return rebuild(list);
    }

    public TreeNode rebuild (LinkedList<String> nodes) {
        if (nodes.isEmpty()) return null;

        String first = nodes.removeFirst();
        if (first.equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(first));

        root.left = rebuild(nodes);
        root.right = rebuild(nodes);
        return root;
    }
}
