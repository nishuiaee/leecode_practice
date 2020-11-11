package Contest;

import Common.Node;
import Common.TreeNode;

import java.util.LinkedList;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-09 21:02
 **/
public class Offer37 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    public void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#").append(",");
            return ;
        }
        sb.append(root.val).append(",");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> list = new LinkedList<>();
        for (String s : data.split(",")) {
            list.add(s);
        }
        return deserialize(list);
    }
    public TreeNode deserialize(LinkedList<String> list) {
        String first = list.removeFirst();
        if (first.equals("#")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(first));
        node.left = deserialize(list);
        node.right = deserialize(list);
        return node;
    }
}
