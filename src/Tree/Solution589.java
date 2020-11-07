//package Tree;
//
//import Common.Node;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//
///**
// * @description:
// * @author: Yuner
// * @create: 2020-11-07 15:56
// **/
//public class Solution589 {
//    List<Integer> res = new ArrayList<>();
//
//    public List<Integer> preorder (Node root) {
//        if (root == null) return res;
//        res.add(root.val);
//        for (int i = 0; i < root.children.size(); i++) {
//            preorder(root.children.get(i));
//        }
//        return res;
//    }
//
//    public List<Integer> preorder1(Node root) {
//        LinkedList<Node> stack = new LinkedList<>();
//        LinkedList<Integer> output = new LinkedList<>();
//        if (root == null) {
//            return output;
//        }
//
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            Node node = stack.pop();
//            output.add(node.val);
//            Collections.reverse(node.children);
//            for (Node item : node.children) {
//                stack.push(item);
//            }
//        }
//        return output;
//    }
//}
