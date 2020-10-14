package Common;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-10-14 20:52
 **/
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }


}
