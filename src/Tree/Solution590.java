package Tree;

import Common.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: N叉树的后序遍历
 * @author: Yuner
 * @create: 2020-11-07 20:26
 **/
public class Solution590 {

    List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return res;
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
        res.add(root.val);
        return res;
    }

    public List<Integer> postorder1(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            output.addFirst(node.val);
            for (Node item : node.children) {
                if (item != null) {
                    stack.add(item);
                }
            }
        }
        return output;
    }
}
