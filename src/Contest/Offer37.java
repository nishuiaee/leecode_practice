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
       StringBuffer sb = new StringBuffer();
       serialize(root, sb);
       return sb.toString();
    }

    public void serialize (TreeNode root, StringBuffer sb) {
        if (root == null) {
            sb.append("#").append(",");
            return ;
        }
        sb.append(root.val);
        serialize(root.left, sb);
        serialize(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String node : data.split(",")) {
            nodes.add(node);
        }

        return deserialize(nodes);
    }

    public TreeNode deserialize(LinkedList<String> nodes) {
        if (nodes.isEmpty()) return null;
        String first = nodes.removeFirst();
        if(first.equals("#")) return null;
        TreeNode treeNode = new TreeNode(Integer.parseInt(first));

        treeNode.left = deserialize(nodes);
        treeNode.right = deserialize(nodes);
        return treeNode;
    }
}
