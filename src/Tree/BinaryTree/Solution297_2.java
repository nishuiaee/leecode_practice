package Tree.BinaryTree;

import Common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-06 10:33
 **/
public class Solution297_2 {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> queue =  new LinkedList<>();
        StringBuffer res = new StringBuffer();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            if (curNode != null) {
                res.append(curNode.val + ",");
                queue.offer(curNode.left);
                queue.offer(curNode.right);
            } else {
                res.append("null,");
            }
        }
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == "") {
            return null;
        }
        String[] val = data.substring(0, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(val[0]));
        int cur = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            if (!"null".equals(val[cur])) {
                curNode.left = new TreeNode(Integer.valueOf(val[cur]));
                queue.offer(curNode.left);
            }
            cur++;
            if (!"null".equals(val[cur])) {
                curNode.right = new TreeNode(Integer.valueOf(val[cur]));
                queue.offer(curNode.right);
            }
            cur++;
        }
        return root;
    }
}
