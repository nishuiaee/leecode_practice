package Common;

import java.util.List;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-14 20:52
 **/
public class Node {
    public int val;
    public Node next;
    public Node random;
    public Node right;
    public Node left;
    public List<Node> children;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }


}
