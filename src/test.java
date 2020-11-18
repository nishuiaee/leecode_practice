
import java.util.*;

public class test {

    public static void main(String[] args) {
      List<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        List<Integer> b = new LinkedList<>();
        b.add(1);
        b.add(2);
        b.add(3);

        Deque<Integer> c = new LinkedList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.remove();
        c.push(1);
        c.pop();
        c.add(4);
        c.poll();
        System.out.println(Arrays.toString(a.toArray()));
        System.out.println(Arrays.toString(b.toArray()));
        System.out.println(Arrays.toString(c.toArray()));
    }
}